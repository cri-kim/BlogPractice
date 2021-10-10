#반복문
menu <- c('짜장면','탕수육','깐풍기','짬뽕')
for( item in menu){
  print(x=item)
}

menu <- c('짜장면','탕수육','깐풍기','짬뽕')
for(item in menu){
  print(item, " want?\n")
  # print는 두개 이상의 문자열을 결합하는 기능이 없어 에러가 발생한다.
}

for(item in menu){
  cat(item," want?\n")
}


#paste()
for(item in menu){
  text <- paste(item, "want?\n")
  print(x=text)
}

#while
i<-5
while(i>0){
  print(x=i)
  i<-i-1
}

for(item in menu){
  if(item %in% c('짜장면','짬뽕')){
    next
    #next로 인해 실행되지 않는다.
    cat(item,' food\n',sep='?')
  } else{
    cat(item, 'next? \n',sep='?')
  }
}

#break
i<-0
while(TRUE){
  print(x=i)
  i<-i+1
  if(i>5){
    break
  }
}

for(i in 0:9){
  print(x=i)
  if(i>5){
    break
  }
}

repeat{
  print(x=i)
  i<-i+1
  if(i > 5){
    break
  }
}

#사용자 정의 함수
Pythagoras <- function(a,b){
  c<- sqrt(x=a^2 + b^2)
  return (c)
}
Pythagoras(a=3, b=4)

#사용자 정의 함수 생성
#getGrade <- function(score){
#  if(score >= 90){
#    grade <- 'A'
#  } else if(score >= 80){
#    grade <- 'B'
#  } else if(score >= 70){
#    grade <- 'C'
#  } else if(score >= 60){
#    grade <- 'D'
#  }else{
#    grade <- 'F'
#  }
#  return (grade)
#}
#getGrade(score=100)

#다른 파일의 함수 호출
##정의한 함수 삭제
rm(getGrade)
source(file='code/myFuncs.R', encoding='UTF-8')

getGrade(score=100)

#기본값 설정
guessHeight <- function(name='홍길동',height=173){
  answer <- paste(name,' 님의 키는 ',height,'cm 입니다.')
  return(answer)
}
guessHeight()
guessHeight(name='정우성',height=186)

####################################################
#R 내장 데이터셋 확인
data()
###################################################

#str() 함수로 행렬 데이터 출력
#iris는 생물 학자가 다중 측점 사용을 소개한 다변량 데이터 셋이다.
# 붓꽃 품종에 대해 길이와 너비를 측정한 값이다.
str(object =iris)

# head(), tail() 함수를 통해 객체의 일부만 출력할 수 있다,.
# 두 함수의 출력 기본 line 수는 6이다.

#as.matrix(x=객체명) 을 통해 R 객체를 행렬로 변환 할 수 있다.
irisMat1 <- as.matrix(x=iris)
head(x=irisMat1)
tail(x=irisMat1, n=3)

irisMat2 <- as.matrix(x=iris[,1:4])
head(x=irisMat2)

#apply()
#행 벡터의 평균 구하기
apply(X = iris[,1:4], MARGIN = 1, FUN = mean)
#연 벡터의 평균 구하기
apply(X = iris[,1:4], MARGIN =2, FUN = mean)

#for 문과의 비교
avg <- c()
for(i in 1:150){
  row <- iris[i,1:4]
  row <- as.numeric(x=row)
  avg[i] <- mean(x=row)
}
#sample() 함수로 임의의 데이터 생성
n<-300000
set.seed(seed =1234)
univ <- data.frame(
  korean = sample(x=40:100, size=n,replace=TRUE),
  english = sample(x=40:100, size=n,replace=TRUE),
  math = sample(x=40:100, size=n,replace=TRUE)
)
str(object=univ)
head(x=univ, n=10L)

# 함수 속도 비교
system.time(expr = {
  avg1 <- c()
  for(i in 1:n){
    avg1[i] <- mean(x=as.integer(x=univ[i,]))
  }
})
system.time(expr = avg2<-apply(X=univ, MARGIN = 1, FUN = mean))

#lapply
lapply(X=univ, FUN=mean)
#sapply
sapply(X = univ, FUN = mean)

sapply(X = univ, FUN = mean, simplify = FALSE)

#사용자 정의 함수사용
source(file='code/myFuncs.R', encoding='UTF-8')
sapply(X = univ, FUN = function(score){
  grade<-sapply(X=score, FUN=getGrade)
  return(grade)
})