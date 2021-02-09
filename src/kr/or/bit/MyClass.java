package kr.or.bit;

import java.io.IOException;

//설계도 == 타입 == 클래스

//내 설계도를 사용하는 개발자가 [예외를 강제] 처리 했으면 좋겠는데

//생성자 함수같은 곳에서 강제 예외 처리 할 수 있게

public class MyClass {
    public MyClass(String path) throws IOException, NullPointerException{
        System.out.println(path);
    }

}
