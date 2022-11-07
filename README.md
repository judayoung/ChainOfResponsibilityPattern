# ChainOfResponsibilityPattern
Chain Of Responsibility with dispenser example

# 사용 이유
처리해야 할 서비스가 다양해서 여러 종류의 객체로 전달해야 할 때, 집합 안에서 다음 객체로 넘기는 방법을 사용한다.

# 상세 내용
명령하는 인터페이스 Chain Of Responsibility가 Chain 인터페이스를 필드(첫번째 Chain)로 갖는다. CoR의 생성자에서 체인 연결 구성을 정한다(A->B->D-...).
또한 Chain 인터페이스의 구현클래스도 다음 Chain을 필드로 가지게 하여, 사슬처럼 연결할 수 있다. 
CoR의 필드(첫번째 Chain)의 메서드를 사용하면, 이어가면서 여러 체인의 메서드가 발동되도록 한다.
