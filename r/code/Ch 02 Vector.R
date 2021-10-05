# print(x='1. 벡터 생성')
# '#' 을 사용하여 주석 처리 가능

a <- c(1L,2L,3L)
print(x=a)
class(x=a)
a <- c(1,2,3)
print(x=a)
class(x=a)

print(x = 101:150)

a<-c()
print(a)

nat <- c('ko','jp','ch','usa','ko','usa','jp')
print(x =nat)
fct <- as.factor(x=nat)
print(x = fct)

fct <- factor(x=nat, levels = c('ko','usa','ch','jp'))
print(x=fct)
as.integer(x=fct)

seq(from =1, to =3, by = 1)
1:3
seq(from = 3, to = 1, by = -1)
seq(from =1, to = 10, by= 2.5)
seq(from =1, to= 10, length=19)
seq(1,3,1)
seq(3)
seq(1,3,1,length.out=5)
seq(1,3,length.out=5)

rep(x=1, times=3)
rep(x=1:3, times=3)
rep(x=1:3, each=3)
rep(x=1:3, length=10)
rep(x=1:3, 3, each=2)
rep(x=1:3, 3, each=2, length=10)

# print(x='2. 원소 선택')
print(x=letters)
# vector의 내장 문자형 벡터 letters 사용
# a~b 출력

# 인덱스로 특정 위치의 값 출력
letters[1]

# 슬라이싱으로 연속되는 특정 벡터 값 선택
s <- letters[1:5]
print(x=s)

s[c(1,2,5)]
s[c(TRUE, FALSE, TRUE, FALSE, TRUE)]
# print(x='3. 원소 추가')
s <- letters[1:5]
s[6] <- 'f'
print(x=s)

s[10] = 'j'
print(x=s)
# print(x='4. 원소 삭제')
s[-10]
print(x=s)
s<-s[-10]
print(x=s)
# print(x='5. 원소 변경')
s <- letters[1:5]
s[1] <- 'A'
print(x = s)
s[2] <- 'B'
print(x = s)

s[1:2] <- c('가','나')
print(x=s)

nat[8] = 'taipei'
print(x=nat)
fct[8] <- 'taipei'
print(x=fct)


levels(x=fct)
levels(x = fct)[5] <- 'taipei'
fct[8]<-'taipei'
print(x=fct)

# print(x='6. 벡터 형변환')
as.integer(x=1.2)
as.integer(x='1.2')
as.integer(x=FALSE) #TRUE =1, FALSE = 0

as.numeric(x=1L)
as.numeric(x='1.2')
as.numeric(x=TRUE)

as.character(x=1L)
as.character(x=1.2)
as.character(x=TRUE)

as.logical(x=0)
as.logical(x=1.2)
as.logical(x='1.2')

e <- as.factor(x = nat)
print(x=e)
class(x=e)
as.integer(x=e)

# print(x='7. 벡터 강제 변환')
c <- c('hello','world')
d <- c(FALSE, TRUE)
e <- as.factor(x=c)

f <- c(d,e)
print(d,e)

print(x=f)
class(x=f)

f <- c(f,3)
print(x=f)
class(x=f)

f<- c(f,'4')
print(x=f)
class(x=f)

# print(x='8. %in% 연산자')
a <- 0:5 
x <- 0
x == a[1]
x == a[2]
x == a[1] | x == a[2] | x ==a[3]

# 간략하게 할 수 있다.
x %in% a