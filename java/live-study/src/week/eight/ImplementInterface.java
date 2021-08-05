package week.eight;

interface Delivery {
	void setDelivery(String member);
}

public class ImplementInterface implements DefineInterface, Delivery{
//인터페이스를 상속받으면 무조건 주어진 추상 메소드들은 정의해주어야한다.
	
	private int price;
	public ImplementInterface() {
		//우리집 치킨 기본 가격은 8000원 이다.
		price = 8000;
	}

	@Override
	public void order(String chickenType) {
		switch (chickenType) {
		case "hot":
			//매운소스는 1000원을 더 받는다.
			price+=1000;
			break;
		case "black":
			//블랙소스는 1500원이다.
			price+=1500;
			break;
		default:
			//나머지는 기본가격이다.
			break;
		}
	}

	@Override
	public int getPrice() {
		//가격을 반환한다.
		return price;
	}
	
	public void takeOut() {
		//테이크아웃은 치킨무 가격 만큼 할인해준다.
		price -= CHICHEN_MOO_PRICE;
	}
	
	@Override
	public void setDelivery(String member) {
		//배송 업체에 따라 가격을 추가한다.
		switch(member) {
			case "baemin":
				price += 2000;
				break;
			case "coupang":
				price += 3000;
				break;
			case "baemin-1":
				price += 3000;
				break;
			case "yogiyo":
				price += 1900;
				break;
			default:
				price +=1500;
		}
	}
}
