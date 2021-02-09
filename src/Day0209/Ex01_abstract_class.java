package Day0209;
/*
추상 클래스
>> 미완성 클래스(완성되지 않는 설계도)
1. 완성된 코드 + 미완성 코드
2. 완성된 코드(함수...실행블럭이 있는 함수: void run(){}) 
   미완성 코드(함수...실행블럭이 없는 함수: void run();)
3. 완성된 클래스(new 가능) : 미완성 클래스(스스로 객체 생성 불가능)

정리
1. 추상클래스(미완성): 스스로 객체 생성 불가(new 사용 불가)
2. 추상클래스 결국 ... 완성된 클래스로 만드는 것이 목적 [상속을 통해서 ...]
3. 상속관계에서 미완성 자원(추상함수) 완성해라 (구현) >> 재정의 해라(추상자원)

설계자 입장에서
>> 의도 >> 상속 >> 반드시 재정의 해라 >> 강제적 구현(믿지 못하니까)

 */

class Car{
    void run() {}  // 강제성이 없다.
}

class Hcar extends Car{
    //Hcar run() 재정의 해도 되고, 안해도 문제 없다
}


////////////////////
abstract class AbClass{//abstract 클래스 안에 최소 1개의 추상자원을 만들겠다.
    //완성된 코드
    int pos;
    void run() {
        ++pos;
    }
    //미완성된 코드
    abstract void stop();//{}(x) >> 추상함수 >> 반드시 재정의 사용
}

class Child extends AbClass{

    @Override
    void stop() { //강제적 구현
        this.pos = 0;
        System.out.println("stop: " + this.pos);
        
    }
    
}

class Child2 extends AbClass{

    @Override
    void stop() {
        this.pos = -1;
        System.out.println("stop: " + this.pos);
        
    }
    
}
public class Ex01_abstract_class {

    public static void main(String[] args) {
        Child ch = new Child();
        ch.run();
        ch.run();
        ch.run();
        ch.run();
        System.out.println(ch.pos);
        ch.stop();
        
        
        Child2 ch2 = new Child2();
        /////////////////////////////////
        //다형성
        AbClass ab = ch;
        //부모 타입의 참조 변수는 자식타입 객체의 주소를 가질 수 있다(다형성)
        //단 부모는 자기타칩의 자원만 볼 수 있다.
        
        ab.run();
        ab.stop();// 재정의
        //부모 타입 접근..추상함수 실행 안된다...재정의 (자식)함수 호출 (예외적으로)
        AbClass ab2 = ch2;
        ab2.run();
        ab2.stop();

    }

}
