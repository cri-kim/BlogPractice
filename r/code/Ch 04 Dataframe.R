#데이터 프레임

#데이터 프레임 생성
num <- seq(from=1, to=10, by=2)
chr <- rep(x=c('a','b'),each=3)

# 길이가 다른 값으로 데이터프레임 생성 불가능
df2 <- data.frame(num,chr)

cha <- letters[1:5]
df1 <- data.frame(num, cha)
print(x=df1)

# 데이터프레임 구조와 값 확인
str(object = df1)

# R언어가 가지고 있는 다양한 옵션 사용가능
#max.print는 기본값이 1000이다. 출력할 수 있는 최대 벡터원소이다.
options('max.print')

# 데이터프레임을 시각화한다.
View(x=df1)

#인덱싱으로 선택하기
df1[1,1]

df1[1:2, 1:2]

df1[1,]
df1[1:2,]
df1[,1]
df1[,1:2]

#문자형 벡터로 열 선택하기
df1[,'num']
df1[,c('num','cha')]

#열 이름으로 열 선택하기
df1$num
df1$cha

#true/false 로 반환하기
df1$num >= 5

df1[df1$num >= 5,]

df1[df1$num >= 5, 'cha']
df1$cha[df1$num >= 5]

#원소 추가하기
df1$int <- 11:15
str(object = df1)

#열 추가하기
cbind(df1, rep(x=TRUE, times=5))
cbind(df1, log= rep(x=TRUE, times=5))

df1<-cbind(df1, log=rep(x=TRUE, times=5))
str(object = df1)

# 행 추가하기
df3 <- data.frame(num=6, cha='f',int=16, log=TRUE)
print(df3)
rbind(df1, df3)
str(object = df1)


#열 벡터 삭제
df1$num <-NULL
str(object = df1)

#인덱싱 삭제
df1[-1,-1]
df1[-1,]
df1[,-1]

#데이터프레임 원소 변경
#LETTERS 는 대문자
df1$cha <- LETTERS[1:5]
print(x=df1)

df1$int[1] <- '11'
str(object = df1)
