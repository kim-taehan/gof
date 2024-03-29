# GOF 디자인 패턴 정리 
> 디자인 패턴이란 기존 환경 내에서 반복적으로 일어나는 문제들을 어떻게 풀어나갈 것인가에 대한 일종의 솔루션

## 1 디자인 패턴 종류
### 1.1 생성패턴 (creational_patterns)
> 생성 패턴들은 기존 코드의 재활용과 유연성을 증가시키는 객체 생성 메커니즘들을 제공합니다.

#### [1.1.1 singleton](src/main/java/org/developx/gof/creational_patterns/singleton)
- 인스턴스를 오직 한개만 제공하는 클래스

#### [1.1.2 factory method](src/main/java/org/developx/gof/creational_patterns/factory_method)
- 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.

#### [1.1.3 abstract factory](src/main/java/org/developx/gof/creational_patterns/abstract_factory)
- 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있다.

#### [1.1.4 builder](src/main/java/org/developx/gof/creational_patterns/builder)
- 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법

#### [1.1.4 prototype](src/main/java/org/developx/gof/creational_patterns/prototype)
- 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법

### 1.2 구조패턴 (structural_patterns)
> 구조 패턴은 구조를 유연하고 효율적으로 유지하면서 객체와 클래스를 더 큰 구조로 조합하는 방법을 설명합니다.

#### [1.2.1 adapter](src/main/java/org/developx/gof/structural_patterns/adapter)
- 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴

#### [1.2.2 bridge](src/main/java/org/developx/gof/structural_patterns/bridge)
- 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴

#### [1.2.3 composite](src/main/java/org/developx/gof/structural_patterns/composite)
- 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴

#### [1.2.4 decorator](src/main/java/org/developx/gof/structural_patterns/decorator)
- 기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴

#### [1.2.5 facade](src/main/java/org/developx/gof/structural_patterns/facade)
- 복잡한 서브 시스템 의존성을 최소화하는 방법

#### [1.2.5 flyweight](src/main/java/org/developx/gof/structural_patterns/flyweight)
- 객체를 가볍게 만들어 메모리 사용을 줄이는 패턴

#### [1.2.6 proxy](src/main/java/org/developx/gof/structural_patterns/proxy)
- 특정 객체에 대한 접근을 제어하거나 기능을 추가할 수 있는 패턴


### 1.3 행동패턴 (behavioral_patterns)
> 행동 패턴은 객체 간의 효과적인 의사소통과 책임 할당을 처리합니다.

#### [1.3.1 chain of responsibility](src/main/java/org/developx/gof/behavioral_patterns/chainofresponse)
- 요청을 보내는 쪽(sender)과 요청을 처리하는 쪽(receiver)의 분리하는 패턴

#### [1.3.2 command](src/main/java/org/developx/gof/behavioral_patterns/command)
- 요청을 캡슐화 하여 호출자(invoker)와 수신자(receiver)를 분리하는 패턴

#### [1.3.3 interpreter](src/main/java/org/developx/gof/behavioral_patterns/interpreter)
- 자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 패턴

#### [1.3.4 interator](src/main/java/org/developx/gof/behavioral_patterns/interator)
- 집합 객체 내부 구조를 노출시키지 않고 순회 하는 방법을 제공하는 패턴

#### [1.3.5 mediator](src/main/java/org/developx/gof/behavioral_patterns/mediator) 
- 여러 객체들이 소통하는 방법을 캡슐화하는 패턴
 
#### [1.3.6 memento](src/main/java/org/developx/gof/behavioral_patterns/memento)
- 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 방법

#### [1.3.7 observer](src/main/java/org/developx/gof/behavioral_patterns/observer)
- 다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 패턴 

#### [1.3.8 state](src/main/java/org/developx/gof/behavioral_patterns/state)
- 객체 내부 상태 변경에 따라 객체의 행동이 달라지는 패턴

#### [1.3.9 strategy](src/main/java/org/developx/gof/behavioral_patterns/strategy)
- 여러 알고리듬을 캡슐화하고 상호 교환 가능하게 만드는 패턴

#### [1.3.10 template_method](src/main/java/org/developx/gof/behavioral_patterns/template_method)
- 알고리듬 구조를 서브 클래스가 확장할 수 있도록 템플릿으로 제공하는 방법

#### [1.3.11 template_callback](src/main/java/org/developx/gof/behavioral_patterns/template_callback)
- 콜백으로 상속 대신 위임을 사용하는 템플릿 패턴

#### [1.3.11 visitor](src/main/java/org/developx/gof/behavioral_patterns/visitor)
- 기존 코드를 변경하지 않고 새로운 기능을 추가하는 방법.


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

