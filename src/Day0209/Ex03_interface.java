package Day0209;
/*
추상클래스: 인터페이스(interface)
인터페이스: 표준, 약속, 규약, 규칙을 만드는 행위

[추상 클래스: 인터페이스 공통점]
1.스스로 객체 생성 불가능(new 연산자를 통한 객체 생성 불가)
1.1 차이점: 추상 클래스(완성 + 미완성), 인터페이스(모든 것이 미완성) > 모든것이 추상자원

2.사용
추상클래스 extends(확장)
인터페이스 반드시 구현 implements 사용
class Car extends abclass{}
class Car implements la{} // 인터페이스가 가지는 모든 추상자원을 재정의 해라

추상클래스 인터페이스
1. 다중 상속(구현) 가능 >> 약속(작은 단위로 여러개) >> 여러개의 작은 약속 모아서 큰 약속 만듬
class Test extends Object implements Ia, Ib, Ic
약속을 크게 만들면 >> 사용성 떨어진다 >> 한정 >> 쪼개어서 ....

2. 추상클래스는 단일원속원칙(계층적 상속)

3. 추상클래스 (완성 + 미완성)

4. 인터페이스는 (상수를 제외한 나머지는 미완성(추상)자원 >> JDK (Default 값, static 값)

인터페이스 소프트웨어 설계 최상위 단계
(경험.....)
어떤 프로젝트 진행 (표준 ....)

++개발자(초급)++
1. 인터페이스 [다형성] 입장으로 접근 (무조건 부모타입)
2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능(인터페이스 구현...같으ㄴ 부모)
3. JAVA API이 사용할 만한 수많은 Interface 만들어 놓음(가져다 쓰는 것만 해도)
4. 인터페이스 (관용적): (~able): 수리할 수 있는, 날 수 있는: Cloneable(관용적 표현)
5. 객체간 연결 고리(객체간 소통) >> 다형성 >> 같은 부모
 */
interface Iable{
    String print();
    //출력할 때 print 함수 사용..... return 문자열
}
/*
class Test implements Iable{

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
*/

//설계 표준 >> 구현 강제 >> 재정의
/*
 1. 실제 구현부를 가지고 있지 않는다.: 실행 블럭이 없는 함수: void run();
 게임 설계 이동 move(int x, int y) >> 인터페이스 >> 탱크, 마린 >> move 구현
 >>JAVA API: Collection(동적배열:자료구조) >> Vector, [ArrayList], HashSet, [HashMap]
 >>Vector, [ArrayList], HashSet, [HashMap]
 
 2. 생성방법 (interface 자원)
 2.1 public static final int VERSION = 1; >> int VERSION = 1 >> 컴파일러가 [public static final] 있다고 친다
 2.2 public abstract void run(); >> [public abstract] 생략 >> void run()
 
 interface Iable{
     public static final VERSION = 1; >> int VERSION = 1;
     public abstract void run(); >> void run();
     String move(int x, int y);
 }
 
 interface Iable { }
 interface Bable { int NUM = 0}
 interface cable { void run(); void move(); }
 
 class Test extends Object implement Iable, Bable, Cable
 
 */

interface Humanable{
    int AGE = 100;
    String GENDER = "남";
    
    String print();
    void message(String str);
    
}

interface Iable2{
    int AGE = 10;
    void info();
    String val(String s);
}

class Test extends Object implements Humanable , Iable2{

    @Override
    public void info() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String val(String s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void message(String str) {
        // TODO Auto-generated method stub
        
    }
    
}

public class Ex03_interface {
    public static void main(String[] args) {
        Test t = new Test();
        Humanable h = t; //부모는 자식객체의 주소를 가질 수 있다.
        System.out.println(h.AGE);
        
        Iable2 ia2 = t;
        System.out.println(ia2.AGE);
    }

}
