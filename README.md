# GOF 디자인 패턴 정리 
> 디자인 패턴이란 기존 환경 내에서 반복적으로 일어나는 문제들을 어떻게 풀어나갈 것인가에 대한 일종의 솔루션

## 1 디자인 패턴 종류
### 1.1 생성패턴 (creational_patterns)
> 생성 패턴들은 기존 코드의 재활용과 유연성을 증가시키는 객체 생성 메커니즘들을 제공합니다.

#### [1.1.1 singleton](src/main/java/org/developx/gof/creational_patterns/singleton/README.md)
- 인스턴스를 오직 한개만 제공하는 클래스

#### [1.1.2 factory method](src/main/java/org/developx/gof/creational_patterns/factory_method/README.md)
- 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.

#### [1.1.3 abstract factory](src/main/java/org/developx/gof/creational_patterns/abstract_factory/README.md)
- 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있다.

#### [1.1.4 builder](src/main/java/org/developx/gof/creational_patterns/builder/README.md)
- 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법

#### [1.1.4 prototype](src/main/java/org/developx/gof/creational_patterns/prototype/README.md)
- 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법

### 1.2 구조패턴 (structural_patterns)

#### [2.1.1 adapter](src/main/java/org/developx/gof/structural_patterns/adapter/README.md)
- 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴

#### [2.1.2 bridge](src/main/java/org/developx/gof/structural_patterns/bridge/README.md)
- 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴

#### [2.1.3 composite](src/main/java/org/developx/gof/structural_patterns/composite/README.md)
- 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴

#### [2.1.4 decorator](src/main/java/org/developx/gof/structural_patterns/decorator/README.md)
- 기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴

#### [2.1.5 facade](src/main/java/org/developx/gof/structural_patterns/facade/README.md)
- 복잡한 서브 시스템 의존성을 최소화하는 방법
## 2. SOLID
> SOLID 원칙이란 객체지향 설계에서 지켜줘야 할 5개의 소프트웨어 개발 원칙( SRP, OCP, LSP, ISP, DIP )을 말한다.
### 2.1 SRP(Single Responsibility Principle): 단일 책임 원칙
- 클래스(객체)는 단 하나의 책임만 가져야 한다는 원칙

### 2.2 OCP(Open Closed Priciple): 개방 폐쇄 원칙
- 확장에 열려있어야 하며, 수정에는 닫혀있어야 한다
```text
[ 확장에 열려있다 ] - 새로운 변경 사항이 발생했을 때 유연하게 코드를 추가함으로써 큰 힘을 들이지 않고 애플리케이션의 기능을 확장할 수 있음
[ 변경에 닫혀있다 ] - 새로운 변경 사항이 발생했을 때 객체를 직접적으로 수정을 제한함. 
```
### 2.3 LSP(Listov Substitution Priciple): 리스코프 치환 원칙
- 서브 타입은 언제나 기반(부모) 타입으로 교체할 수 있어야 한다는 원칙
- 업캐스팅된 상태에서 부모의 메서드를 사용해도 동작이 의도대로 흘러가야 하는 것을 의미

### 2.4 ISP(Interface Segregation Principle): 인터페이스 분리 원칙
- 인터페이스를 각각 사용에 맞게 끔 잘게 분리해야한다는 설계 원칙
- 인터페이스는 제약 없이 자유롭게 다중 상속(구현)이 가능하기 때문에, 분리할 수 있으면 분리하여 각 클래스 용도에 맞게 implements 하라는 설계 원칙이라고 이해하면 된다.

### 2.5 DIP(Dependency Inversion Principle): 의존 역전 원칙
- 상위 모듈은 하위 모듈에 의존해서는 안 되고 둘 다 추상화에 의존해야 한다.
- 추상화는 세부 사항에 의존해서는 안 되고 세부사항(구체적인 구현)은 추상화에 의존해야 한다.

