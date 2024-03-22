# 송승헌 202330215



## 3월 15일
내용

## 3월 22일
!! 새로운 프로젝트 만들땐 새로운 파일에 생성할것(기존 프로젝트 안에 x)

프로그램 작성 언어
    기계어, 어셈블리어, 고급 언어

컴파일
    자바: .java -> .class
    C: .c -> .obj -> .exe
    C++: .cpp -> .obj -> exe

플랫폼 = 하드웨어 플랫폼 + 운영체제 플랫폼

프로그램의 플랫폼 호환성 없는 이유
    1. 기계어가 cpu마다 다름
    2. 운영체제마다 API가 다름
    3. 운영체제마다 실행파일 형식 다름

인텔 CPU를 가진 리눅스에서 개발 --o--> C/C++ 응용프로그램
Intel CPU + 리눅스(실행가능)
Apple사의 MAC PC(실행 x)
Intel CPU + 윈도우 노트북(실행 x)

#### WORA
    한번 작성된 코드는 모든 플랫폼에서 바로 실행되는 자바의 특징
    C/C++등 기존언어가 가진 플랫폼 종속성 극복 : OS, H/W에 상관없이 자바 프로그램 동일하게 실행
    네트워크에 연결된 어느 클라이언트에서나 실행 : 웹 브라우저, 분산 환경 지원

#### WORA를 가능케 하는 자바의 특징
    바이트 코드 : 자바 소스를 컴파일한 목적코드, 중립적인 코드(CPU에 종속 x), JVM에 의해 해석되고 실행
    JVM : 자바 바이트 코드를 실행하는 자바 가상 세계

### 자바 API
#### 1. 자바 API란?
    JDK에 포함된 클래스 라이브러리
    개발자는 API를 이용하여 쉽고 빠르게 자바 프로그램 개발
    API에서 정의한 규격에 따라 클래스 활용
#### 2. 자바 패키지
    서로 관련된 클래스들을 분리해서 묶어 놓은 것
    계층구조로 되어있음
    자바 API는 JDK에 패키지 형태로 제공됨
    개발자 자신의 패키지 생성 가능