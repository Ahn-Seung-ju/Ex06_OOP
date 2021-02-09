package Day0208;
/*
String >> 클래스 > new 통해서 사용가능 > 일반적인 값타입 처럼 사용해도 문제가 없음
String 가지고 있는 수 많은 함수(문자열....조작하는 것(함치고 자르고 붙이고))
String 가지는 다양한 함수 활용(static 함수 + 일반함수)
최소 15개 ~ 20 암기 중요매우우우우우우우중요
 */
public class Ex05_String_Class {

    public static void main(String[] args) {
        String str = "";
        System.out.println(">" + str + "<");
        //사용방법: int, double 와 같이 사용
        
        String[] strarr = {"a" + "b" + "c"};
        for(String s : strarr) {
            System.out.println(s);
        }
        ///////////////////////////////지금까지/////////////////
        String str2 = "홍길동";
        System.out.println(str2.length());
        System.out.println(str2.toString());//Object >> toString() 재정의 
        System.out.println(str2);//toString() 생략생략불생볶냉
        
        String str3 = new String("김유신");
        
        //1. String name = "abcd";
        //String 클래스의 내부적으로 저장되는 자료구조 char[] >> [a][b][c][d] >> 그냥 써 원래대로
        //class String extends Object { char[] value ... toString() .. length()}
        
        String str4 = "AAA";
        String str5 = "AAA";
        System.out.println(str4);
        System.out.println(str5.toString());
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));

        // == 연산자 값을 비교 (str4(주소값), str5(주소값))
        //같은 주소
        //주소가 아니고 가지고 값을 비교 (문자열)
        //String 비교를 == 쓰면 병신
        String str6 = new String("BBB");
        String str7 = new String("BBB");
        
        
        System.out.println(str6 == str7);
        //String 만들때 new 사용하면 강제적으로 메모리 할당
        System.out.println(str6.equals(str7));
        
        //문자열비교는 equals 사용.....무조건
        
        //넌센스
        //메모리를 하나씩 더 만든다 > 하나씩 new 를 만들어 heap에 넣는다
        String s = "A";
        s+="B";
        s+="C";
        System.out.println(s);
        s = "A";// 원래 있던 배열이면 재사용 > 다시 객체를 만들지 않는다
        
        
        //질문
        //String 1000개의 문자를 누적해라
        //성능상 for문을 쓰거나 직접 누적하지 하지않는다.
        
        //누적데이터 ....
        //StringBuffer
        //StringBuilder

    }

}
