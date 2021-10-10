# 조건문
obj <- 1L
class(x=obj)

class(x=obj) == 'integer'

if(class(x=obj) == 'integer'){
  print(x='정수입니다!')
}
# 한줄의 실행 구문은 중괄호({}) 생략 가능
if(class(x=obj) == 'integer')
  print(x='정수입니다!')


obj <- as.character(x=obj)
if(class(x=obj) == 'integer'){
  print(x='정수입니다!')
}

# if-else if = else 구문
if(class(x=obj) == 'integer'){
  print(x='정수입니다!')
} else if(class(x=obj)=='numberic') {
  print(x='실수 입니다.')
} else {
  print(x='숫자가 아닙니다.')
}

#ifelse
score<-seq(from=40, to=100,by=100)
ifelse(test = score >= 70, yes='합격', no='불합격')

df <- data.frame(score)
str(object=df)

df$grade <- ifelse(test=df$score >= 70, yes='합격', no='불합격')
print(x=df)
