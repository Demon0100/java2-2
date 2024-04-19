# 송승헌 202330215


## 4월 19일
### 메소드 오버라이딩
#### 조건
슈퍼 클래스 메소드의 원형(메소드 이름, 인자 타입 및 개수 리턴 타입)동일하게

### 오버로딩과 오버라이딩
#### 메소드 오버로딩
#### 오버라이딩

### 추상 클래스
#### 추상 메소드
* abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언
#### 추상 클래스
* 추상 메소드를 가지며, abstract로 선언된 클래스
* 추상 메소드 없이, abstract로 선언한 클래스
#### 인스턴스 생성 불가
추상 클래스는 온전한 클래스가 아니기 때문에 생성 불가
### 추상 클래스의 상속과 구현
#### 상속
* 추상 클래스를 상속 받으면 추상 클래스가 됨
* 서브 클래스도 abstract로 선언해야 함
#### 구현
* 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)
* 추상 클래스를 구현한 서브 클래스는 추상 클래스 아님
#### 목적
* 상속을 위한 슈퍼 클래스로 활용하는 것
* 서브 클래스에서 추상 메소드 구현
* 다형성 실현

### 자바의 인터페이스
* 클래스가 구현해야 할 메소드들이 선언되는 추상형
* 인터페이스 선언
#### 자바 인터페이스에 대한 변화
* java 7꺼지 인터페이스는 상수와 추상 메소드로만 구성
* java 8부터 상수와 추상메소드 포함

### 모듈과 패키지란?
#### 패키지
* 서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묶어 놓은 디렉터리
* 하나의 응용프로그램은 한 개 이상의 패키지로 작성
* 패키지는 jar 파일로 압축할 수 있음
#### 모듈
* 여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너
* 하나의 모듈을 하나의 .jmod 파일에 저장
#### 모듈화의 목적
* java9부터 자바 API를 여러 모듈로 분할(8까지는 rt.jar 한 파일에 모든 API저장)
* 응용 프로그램이 실행할 때 꼭 필요한 모듈들로만 실행 환경 구축
#### 모듈의 현실
* java9 부터 전면적으로 도입
* 복잡한 개념
* 큰 자바 응용 프로그램에는 개발,유지보수 등에 적합
* **현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요 없음

### Wrapper 클래스
* 자바의 기본 타입을 클래스화한 8개 클래스를 통칭<br>
    byte->Byte, short->Short, int->Integer, iong->Long, char->Character, float->Float,double->Double, boolean->Boolean

### 스트링 리터럴과 new String()
#### 스트링 리터럴
* 자바 가상 기계 내부에서 리터럴 테이블에 저장되고 관리됨
* 응용 프로그램에서 공유됨


## 4월 12일
### 접근 지정자
private, protected, public, 디폴트(접근지정자 생략)
#### 목적
    클래스나 일부 멤버를 공개하여 다른 클래스에서 접근 허용
#### 클래스 접근 지정
    다른 클래스에서 사용하도록 허용할지 결정

### static 멤버
    static 멤버 선언
    객체 생성과 non-static 멤버의 생성(non-static멤버는 객체가 생성될때, 객체마다 생김)
#### static 멤버의 생성
    static 멤버는 클래스당 하나만 생성
    객체들에 의해 공유됨

#### static 메소드의 제약조건
-오직 static 멤버만 접근가능
#### static 메소드의 제약조건
-this 사용불가(this는 자기자신의 레퍼런스에서만 사용)

### final 클래스와 메소드
#### final 클래스
-더 이상 클래스 상속 불가
#### final 메소드
-더 이상 오버라이딩 불가
#### final 핃드, 상수 선언
* 상수를 선언할 때 사용
* 상수 필드는 선언 시에 초기 값을 지정해야 함
* 실행중에 값 변경 불가

### 클래스 상속과 개체
#### 상속 선언
    extends 키워드로 선언(부모클래스를 물려받아 확장한다는 뜻)
    부모클래스 -> 슈퍼클래스
    자식클래스 -> 서브클래스

#### 서브 클래스 객체의 모양
    슈퍼 클래스 객체와 서브 클래스의 객체는 별개
    서브 클래스 객체는 슈퍼 클래스 멤버 포함

### 자바 상속의 특징
    클래스 다중 상속 불허(C++은 다중 상속 불허,자바는 인터페이스의 다중 상속 허용)
    모든 자바 클래스는 묵시적으로 Object클래스 상속받음

#### 서브 클래스/슈퍼 클래스의 생성자 호출과 실행
서브 클래스의 객체가 생성될 때 슈퍼 클래스 생성자와 서브 클래스 생성자 모두 실행
#### 서브 클래스/슈퍼 클래스의 생성자 선택
서브 클래스의 객체가 생성될 때 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개 실행
#### 서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식
1. 개발자의 명시적 선택
2. 컴파일러가 기본 생성자 선택

### 업캐스팅
    기본 클래스의 포인터로 파생 클래스의 객체를 가리키는 것
    서브 클래스의 레퍼런스를 슈퍼 클래스 래퍼런스에 대입
    슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가리키게 되는 현상

### 다운캐스팅
    슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
    업캐스팅된 것을 다시 원래대로 되돌리는 것
    반드시 명시적 타입 변환 지정

### instanceof 연산자
#### instanceof 연산자
    레퍼런스가 가리키는 객체의 타입 식별
    객체레퍼런스 instanceof 클래스타입


## 4월 5일
### 2차원 배열
* 2차원 배열 선언 -> int intArray[ ][ ]; or int[ ][ ] intArray;
* 2차원 배열 생성 -> intArray = new int[2][5]; , int intArray[ ] = new int[2][5]; // 배열 선언과 생성 동시

### 메소드의 배열 리턴
#### 배열 리턴
* 배열의 레퍼런스만 리턴

#### 메소드의 리턴 타입
* 리턴하는 배열타입과 리턴 받는 배열 타입 일치
* 리턴 타입에 배열의 크기를 지정 x

### 배열을 리턴받아 사용하는 과정
1. int[] int Array;
2. makeArray();
3. intArray에 temp값 치환
4. for (int i=0; i<intArray.length; i++>) ~~~~

### 자바의 예외처리
#### 예외
    실행중 오동작이나 결과에 악영향을 끼치는 예상치 못한 상황 발생
#### 예외 발생 경우
* 정수를 0으로 나누는 경우
* 배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우
* 정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우

#### try-catch-finally문
try {<br>  예외가 발생할 가능성이 있는 실행문(try 블록)

}<br>
catch (처리할 예외 타입 선언) {<br>
    예외 처리문

}<br>
finally {<br>
    finally 블록문

}

### 자바의 객체 지향 특성: 캡슐화
#### 캡슐화
객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것(외부의 접근으로 부터 객체 보호)
#### 자바의 캡슐화
* 클래스(class):객체 모양을 선언한 틀
* 객체:생성된 실체(instance)

### 자바의 객체 지향 특성: 상속
#### 상속
* 상위 개체의 속성이 하위 개체에게 물려짐
* 하위 개체가 상위 개체의 속성을 모두 가지는 관계
#### 자바 상속
    상위 클래스*의 멤버를 하위 클래스*가 물려받음
    *상위 클래스 : 슈퍼클래스
    *하위 클래스 : 서브클래스, 슈퍼클래스 코드의 재사용, 새로운 특성 추가 가능
    
### 자바의 객체 지향 특성: 다형성
#### 다형성
같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것

### 객체 지향 언어의 목적
1. 소프트웨어의 생산성 향상
    * 컴퓨터 산업 발전에 따라 소프트웨어의 생명 주기 단축
    * 객체 지향 언어
        * 상속, 다형성, 객체, 캡슐화등 소프트웨어 재사용을 위한 여러 장치 내장
        * 소프트웨어 재사용과 부분 수정 빠름
        * 소프트웨어를 다시 만드는 부담 줄임
        * 소프트웨어 생산성 향상
2. 실세계에 대한 쉬운 모델링
    * 초기 프로그래밍
        * 수학 계산/통계 처리를 하는 등 처리과정, 계산 절차 중요
    * 현대 프로그래밍
        * 컴퓨터가 산업 전반에 활용
        * 실세계에서 발생하는 일을 프로그래밍
    * 객체지향언어

### 클래스와 객체
#### 클래스
* 객체의 속성과 행위 선언
* 객체의 설계도 혹은 틀
#### 객체
* 클래스의 틀로 찍어낸 실체
    * 프로그램 실행중에 생성되는 실체
    * 메모리 공간을 갖는 구체적인 실체

### 자바 클래스 구성
#### 클래스
* class 키워드로 선언
* 멤버 : 클래스 구성요소

### 생성자 개념과 목적
#### 생성자
객체가 생성될때 초기화 목적으로 실행되는 메소드(객체가 생성되는 동시에 자동 호출)

### this 레퍼런스
#### this
* 객체 자신에 대한 레퍼런스
    * 컴파일러에 의해 자동관이, 개발자는 사용만 하면 됨
    * this.멤버 형태로 멤버를 접근할때 사용

### 메소드
* 메소드는 C/C++의 함수와 동일
* 자바의 모든 메소드는 반드시 클래스 안에 있어야 함(캡슐화 원칙)

### 메소드 오버로딩
#### 오버로딩
* 한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성
    * 메소드 이름이 동일해야 함
    * 매개 변수의 개수가 다르거나, 타입이 달라야함
    * 리턴 타입은 오버로딩과 관련x

### 객체 소멸
    new에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위
    소멸된 객체 공간은 가용 메모리에 포함
#### 자바에서 사용자 임의로 객체 소멸 안됨
* 자바는 객체 소멸 연산자 없음
* 객체 소멸은 자바 가상 기계의 고유한 역할

### 가비지
    가리키는 레퍼런스가 하나도 없는 객체
#### 가비지 컬렉션
자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 반환

## 3월 29일
### 리터럴과 정수 리터럴
#### 리터럴
* 프로그램에서 직접 표현한 값
* 정수, 실수, 문자, 논리, 문자열 리터럴 있음

#### 정수 리터럴
* 10진수, 8진수, 16진수, 2진수 리터럴
* long타입 리터럴은 숫자뒤에 L 또는 l 붙여 표시

### 문자 리터럴
* 단일 인용부호(' ')로 문자 표현
* 특수문자 리터럴은 백슬래시로 시작

### 논리 타입 리터럴
true or false

### 기본 타입 이외의 리터럴
* null 리터럴
* 문자열(String) 리터럴, (" ")로 문자 표현

### 상수
#### 상수 선언
    1. final 키워드 사용
    2. 선언 시 초깃값 지정
    3. 실행 중 값 변경 불가

### var 키워드
#### var 키워드
컴파일러가 추론하여 변수 타입 결정<br>
그러나, 변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류

### 타입 변환
#### 타입 변환
한 타입의 값을 다른 타입의 값으로 변환
#### 자동 타입 변환
컴파일러에 의해 원래의 타입보다 큰 타입으로 자동 변환
#### 강제 타입 변환
개발자의 의도적 타입 변환<br>
() 안에 개발자가 명시적으로 타입 변환 지정<br>
강제 변환은 값 손실 우려

### System.in
직접 사용할 시 바이트를 문자나 숫자로 변환하는 경우 발생<br>
때문에, Scanner 클래스 사용
### Scanner
읽은 바이트를 문자, 정수, 실수, 불린, 문자열들 다양한 타입으로 변환하여 리턴<br>
키보드에 System.in을 읽게하고 원하는걸로 변환

### 자바 배열
#### 배열(array)
    인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
    배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간
    배열 인덱스

#### 배열의 length 필드 활용
#### 배열과 for-each문

## 3월 22일
!! 새로운 프로젝트 만들땐 새로운 파일에 생성할것(기존 프로젝트 안에 x)

프로그램 작성 언어
* 기계어
* 어셈블리어
* 고급 언어

컴파일
* 자바: .java -> .class
* C: .c -> .obj -> .exe
* C++: .cpp -> .obj -> exe

플랫폼 = 하드웨어 플랫폼 + 운영체제 플랫폼

프로그램의 플랫폼 호환성 없는 이유
1. 기계어가 cpu마다 다름
2. 운영체제마다 API가 다름
3. 운영체제마다 실행파일 형식 다름

인텔 CPU를 가진 리눅스에서 개발 --o--> C/C++ 응용프로그램 ---->
1. Intel CPU + 리눅스(실행가능)
2. Apple사의 MAC PC(실행 x)
3. Intel CPU + 윈도우 노트북(실행 x)

#### WORA
    *한번 작성된 코드는 모든 플랫폼에서 바로 실행되는 자바의 특징
    *C/C++등 기존언어가 가진 플랫폼 종속성 극복 : OS, H/W에 상관없이 자바 프로그램 동일하게 실행
    *네트워크에 연결된 어느 클라이언트에서나 실행 : 웹 브라우저, 분산 환경 지원

#### WORA를 가능케 하는 자바의 특징
    *바이트 코드 : 자바 소스를 컴파일한 목적코드, 중립적인 코드(CPU에 종속 x), JVM에 의해 해석되고 실행
    *JVM : 자바 바이트 코드를 실행하는 자바 가상 세계

### 자바 API
#### 1. 자바 API란?
    *JDK에 포함된 클래스 라이브러리
    *개발자는 API를 이용하여 쉽고 빠르게 자바 프로그램 개발
    *API에서 정의한 규격에 따라 클래스 활용
#### 2. 자바 패키지
    *서로 관련된 클래스들을 분리해서 묶어 놓은 것
    *계층구조로 되어있음
    *자바 API는 JDK에 패키지 형태로 제공됨
    *개발자 자신의 패키지 생성 가능

### 자바 개발 환경-이클립스
#### 1. IDE란?
    *통합 개발 환경
    *편집, 컴파일, 디버깅을 한번에 할 수 있는 통합된 개발 환경
#### 2. 이클립스
    *자바 응용 프로그램 개발을 위한 통합 개발 환경
    *IBM에 의해 개발된 오픈 소스 프로젝트

### 자바의 특징(1)
####  플랫폼 독립성
운영체제
#### 객체지향
하드웨어, 운영체제에 종속되지 않는 바이트 코드로 플랫폼 독립성
#### 클래스로 캡슐화
#### 소스(.java)와 클래스(.class) 파일
* 하나의 소스 파일에 여러 클래스를 작성 가능(public클래스는 하나만 가능)
* 소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야 함
* 클래스 파일에는 하나의 클래스만 존재

### 자바의 특징(2)
#### 실행 코드 배포
구성(한개의 class 파일 또는 다수의 class 파일로 구성, 여러 폴더에 걸쳐 다수의 클래스 파일로 구성된 경우:jar 압축 파일로 배포)

자바 응용프로그램의 실행은 main()메소드에서 시작(하나의 클래스 파일에 두개 이상의 main()메소드 존재x)
#### 패키지
* 서로 관련 있는 여러 클래스를 패키지로 묶어 관리
* 패키지는 폴더 개념
#### 멀티스레드
여러 스레드의 동시 수행 환경 지원(자바는 자체적으로 멀티스레드 지원, C/C++은 멀티스레드를 위해 운영체제 API 호출)
#### 가비지 컬렉션
자바 언어는 메모리 할당 기능은 있어도 메모리 반환 기능 없음

### 자바의 특징(3)
#### 실시간 응용 프로그램에 부적합
* 실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행 때문
#### 자바 프로그램은 안전
* 타입 체크 엄격
* 물리적 주소를 사용하는 포인터 개념 없음
#### 프로그램 작성 쉬움
* 포인터 개념이 없음
* 동적 메모리 반환 하지 않음
* 다양한 라이브러리 지원
#### 실행 속도 개선을 위한 JIT 컴파일러 사용
* 자바는 바이트 코드를 인터프리터 방식으로 실행(기계어가 실행되는 것보다 느림)
* JIT컴파일 기법으로 실행속도 개선(바이트코드를 기계어로 컴파일해 기계어를 실행하는 기법)

### 식별자
1. 식별자란?
    * 클래스, 변수, 상수, 메소드등에 붙이는 이름
    * 식별자의 원칙
        * 특수 문자, 공백, 탭은 식별자로 사용x
        * 유니코드 사용o 한글 사용 x
        * 자바 언어의 키워드는 식별자로 사용x
        * 식별자의 첫 번째 문자로 숫자는 사용x

#### 대소문자 구별

2. 문자열
    * 문자열은 기본 타입이 아님
    * String 클래스로 문자열 표현

## 3월 15일
내용
