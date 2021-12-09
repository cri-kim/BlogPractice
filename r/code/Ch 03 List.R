# 리스트 생성
num <- seq(from=1, to =10, by=2)
cha <- rep(x=c('a','b'),each=3)

lst1<-list(num, cha)
print(x=lst1)

class(x=lst1)

# list 의 구조 확인(structure의 약자)
# lm() 함수로 선형 회귀 모혀을 생성하면 해당값은 리스트로 반환된다.
# str() 함수로 이러한 다양한 자료구조들의 구조를 빠르게 파악하면 업무에 도움이 된다.
# www.rocumentation.org/packages/stats/versions/3.6.2/topics/lm
str(object=lst1)

#원소명이 붙은 리스트 생성
lst2 <- list(a=num, b=cha, c=lst1)
print(x=lst2)
class(x=lst2)
str(object=lst2)


#리스트 원소 선택
lst1$a
lst2$b

lst1[[1]]
# 2개 이상을 동시에 선택할 수 없다.
lst2[[1,3]]

lst2[1]
# 해당 위치의 원소를 리스트로 반환한다.
lst2[c(1,3)]

#리스트 원소 추가
lst2$d <- 1:5
str(object=lst2)

#리스트 원소 삭제
lst2&a <- NULL
str(object = lst2)

#리스트 원소 변경
#통째로 변경가능능
lst2$b <- letters[1:5]
print(x=lst2$b)

#원소만 변경 가능
lst2$b[1] <- 'A'
print(x=lst2$b)


