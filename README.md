# 송승헌 202330215

## 3월 29일
### 리터럴과 정수 리터럴
#### 리터럴
    프로그램에서 직접 표현한 값
    정수, 실수, 문자, 논리, 문자열 리터럴 있음

#### 정수 리터럴
    10진수, 8진수, 16진수, 2진수 리터럴
    long타입 리터럴은 숫자뒤에 L 또는 l 붙여 표시

### 문자 리터럴
1. 단일 인용부호(' ')로 문자 표현
2. 특수문자 리터럴은 백슬래시로 시작

### 논리 타입 리터럴
true or false

### 기본 타입 이외의 리터럴
1. null 리터럴
2. 문자열(String) 리터럴, (" ")로 문자 표현

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
