from bs4 import BeautifulSoup
from pandas.core.algorithms import mode
import requests 
import pandas as pd
import os

#subject : KISA에서 IP 주소 대역 제공되는 국가 크롤링
#2021-07-26

#한국인터넷 정보센터(KISA)
target_url = "https://xn--3e0bx5euxnjje69i70af08bea817g.xn--3e0b707e/jsp/statboard/IPAS/ovrse/natal/IPaddrBandCurrent.jsp"

def get_nation_list():
    
    html = requests.get(target_url)
    html_bs = BeautifulSoup(html.text, 'html.parser')

    selector = html_bs.find('select', id='nationCode')
    tags = selector.find_all('option')
    nation_list = []

    for tag in tags:
        name = tag.get_text()
        code= tag['value']
        nation_list.append(name)
        export_ip_list(code)
    return nation_list

def get_ip_list(code):
    url = target_url +"?nationCode1="+code
    html = requests.get(url)
    html_bs = BeautifulSoup(html.text, 'html.parser')
    selector = html_bs.find('table')
    tags = selector.find('tbody').find_all('tr')
    ip_list = []
    for tag in tags:
        name = tag.get_text()
        ip_list.append(name)
    return ip_list

def export_ip_list(code):
    #title = "global_ip_list.xlsx"
    url = target_url +"?nationCode1="+code
    #table = pd.read_html(url)[0]
    print(pd.read_html(url)[0])
    #db = pd.DataFrame(table);
    #if not os.path.exists(title):
    #    with pd.ExcelWriter(title, mode='w', engine='openpyxl') as writer:
    #        db.to_excel(writer, index=False)
    #else:
    #    with pd.ExcelWriter(title, mode='a', engine='openpyxl') as writer:
    #        db.to_excel(writer, index=False, header=False)

        


if __name__ == "__main__":
    get_nation_list() 