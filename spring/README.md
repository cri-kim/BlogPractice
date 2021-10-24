# Spring

<details>
	<summary>스프링(spring)이 무엇인가요?</summary>
	<div markdown="1">
	스프링은 JVM 위에서 동작하는 어플리케이션 개발에 사용되는 application framework 입니다.
	application framework는 개발을 빠르고 효율적으로 할 수 있도록 틀과 공통 프로그래밍 모델, 기술 API 등을 제공합니다.
	</div>
</details>
<details>
	<summary>스프링 컨테이너는 무엇이고 어떻게 동작하나요?</summary>
	<div markdown="1">
	스프링 컨텍스트(spring context) 라고도 불리는 스프링 런타임 엔진 입니다.
	스프링 프레임워크의 기본 틀입니다. 설정 정보를 참고로 application을 구성하는 오브젝트를 생성하고 관리합니다.
	application 코드가 작성되어야 하는 기준인 세 가지 핵심 프로그래밍 모델을 지원합니다.
	IoC/DI, 서비스 추상화, AOP 가 있습니다.
	</div>
</details>
<details>
	<summary>DAO 가 무엇이고 어떻게 동작하나요?</summary>
	<div markdown="1">
	Data Access Object의 약자입니다. DB를 사용하여 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 오브젝트입니다.
	
	DB 연결을 위해 JDBC 를 통해 Connection을 가져오고, SQL을 만들고 실행합니다.
	조회의 경우 SQL 쿼리의 실행 결과를 받아 정보를 저장한 Object에 옮깁니다.
	</div>
</details>
<details>
	<summary>IoC는 무엇이고 어떻게 동작하나요?</summary>
	<div markdown="1">
	IoC는 제어의 역전, Inversion of Control입니다. 스프링을 통해 많이 알려졌지만 오래전부터 사용되던 용어입니다.
	제어의 역전이라는 것은 프로그램의 제어 흐름 구조가 뒤바뀌는 것 입니다.
	객체 스스로 사용하는 객체를 선택,생성하지 않습니다. 또한 어떻게 사용되는지 모르며 모든 권한을 다른 객체에 위임하게 됩니다.
	
	스프링에서는 객체에 대한 제어권을 가지고 직접 관리를 부여합니다. 이렇게 스프링이 관리하는 객체를 빈(Bean)이라고 합니다.
	빈 생성과 같은 제어를 담당하는 IoC 객체를 빈 팩토리(Bean Factory)라고 합니다.
	</div>
</details>
<details>
	<summary>의존관계 주입(DI)는 무엇이고 어떻게 동작하나요?</summary>
	<div markdown="1">
	</div>
</details>
<details>
	<summary>스프링에서 싱글톤 패턴(Singleton Pattern)은 어떻게 동작되나요?</summary>
	<div markdown="1">
	</div>
</details>
<details>
	<summary>싱글톤 패턴의 한계점을 알려주세요.</summary>
	<div markdown="1">
	</div>
</details>
<details>
	<summary>스프링 빈의 스코프는 무엇인가요?</summary>
	<div markdown="1">
	</div>
</details>
<details>
	<summary>스프링에서 테스트는 왜 필요할까요?</summary>
	<div markdown="1">
	</div>
</details>
<details>
	<summary>테스트 주도 개발은 목표는 무엇인가요?</summary>
	<div markdown="1">
	</div>
</details>