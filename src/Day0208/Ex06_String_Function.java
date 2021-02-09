package Day0208;

public class Ex06_String_Function {

    public static void main(String[] args) {
        // 일상적으로 다루는 데이터: 문자열, 숫자, 날짜 >> 함수로 만들어짐 >> 시스템 함수
        String str = "hello";
        String concatstr = str.concat(" world");
        System.out.println(concatstr);

        boolean bo = str.contains("ello");
        System.out.println(bo);

        bo = str.contains("elo");
        System.out.println(bo);

        String str2 = "a b c d";// [a][ ][b][ ][c][ ][d]
        System.out.println(str2.length());

        String filename = "hello java world";
        System.out.println(filename.indexOf("j"));// 문자열의 같은 index값을 찾아준다
        System.out.println(filename.indexOf("java"));
        System.out.println(filename.indexOf("개폭망")); // 배열값이 없다. return -1
        // 신문사설 ... 단어 ,,, 문자 포함 ,,,
        // 폭망 ... 있을까 .. 0보다 큰 값이 나오면 최소 1개 있다
        // -1 return 폭망이 없구나....
        if (filename.indexOf("wo") != -1) {
            System.out.println("wo 하나라도 가지고 있구나");
        }

        System.out.println(filename.lastIndexOf("a"));

        // length(), indexOf(), substring(), replace(), split() >문장에서 문장열을 뽑아라,
        // replace(). split();

        String result = "superman";
        System.out.println(result.substring(0));// superman 0부터 끝까지
        System.out.println(result.substring(2));// perman 2부터 끝까지
        System.out.println(result.substring(1, 8));// u >>endindex -1
        System.out.println(result.substring(0, 0));// (0,-1)

        // Quiz
        String filename2 = "h34.jpeg";// 또는 파일명이 hong.png 또는 파일명이
        // 여기서 파일명과 확장자를 분리해서 하면에 출력하세요
        // 1. 파일명 h
        // 2. 확장자 jpeg
        int a = filename2.lastIndexOf(".");
        ;

        for (int i = 0; i < filename2.length(); i++) {
            if (i == a) {
                System.out.println(filename2.substring(0, i));

            } else if (i > a) {
                System.out.println(filename2.substring(i, filename2.length()));
                break;
            }
        }

        String str3 = "ABDLIDDDDDJFLD";
        String result3 = str3.replace("DDDD", "OMEGA");
        System.out.println(result3);

        result3 = str3.replace("A", "a");
        System.out.println(result3);

        // ETC
        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(3));

        System.out.println(str3.endsWith("JFLD"));// true
        System.out.println(str3.endsWith("DDBDD"));// false

        System.out.println(str3.equalsIgnoreCase("avdli"));// 대소문자 구별없이

        // Today Point split();
        /*
        String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
        str4.split(",");
        String[] namearr = str4.split(",");
        for (String s : namearr) {
            System.out.println(s);
        }
        */
        String path = "C:\\Temp";   //   \\ > \ .을 표현사는 정규표현식 >> \.  >>  \\.
        String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
        String[] namearr = str4.split("\\.");// 자바가 \ 이스케이프 문자로 보기 때문에
        for (String s : namearr) {
            System.out.println(s);
        }
        //String[] java.lang.String.split(String regex)
        // 정규표현식... 한다 곧 한다
        //java, javascript, Oracle, C#) 언어에서 정규 표현식
        //어떠한 문자를 만들때 [규칙] >> 유효성 판단 근거
        //주민번호 숫자 6자리-숫자 7자리: {\d6}
        //123-1234567 >> false
        //핸드폰 번호, 차량번호, 우편번호, 한글 처리, 도메인 주소, 이메일 주소
        //정규표현식은 이미 다 있음 (정규표현식 read 가능)
        

        // TIP) Java 특수문자
        // 이스케이프 문자 >> 특정 문자 앞에 \
        char sing = '\'';

        // 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정
        System.out.println(sing);
        // 홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력
        String ename = "홍\"길\"동";
        System.out.println(ename);
        //

        // 넌센스
        String str6 = "홍                길             동";
        // "홍길동"
        // 저장 >> 공백 제거 >> "홍길동"
        System.out.println(str6.replace(" ", ""));

        String str7 = "               홍길동                ";
        System.out.println(">" + str7 + "<");
        System.out.println(">" + str7.trim() + "<");

        String str8 = "           홍           길          동           ";
        String result5 = str8.trim();
        String result6 = result5.replace(" ", "");
        System.out.println(result6);

        // 자바에서 여러개의 함수를 적용 (method chain 기법)
        System.out.println(str8.trim().replace(" ", "").substring(2));

        // Quiz -1
        int sum = 0;
        String[] numarr = { "1", "2", "3", "4", "5" };
        // 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력: 결과15
        for (int i = 0; i < numarr.length; i++) {
            sum += Integer.parseInt(numarr[i]);// 문자열값을 정수로
            // Double.parseDouble(result6);//실수값을 문자열로
        }
        System.out.println("sum: " + sum);

        // Quiz - 2
        String jumin = "123456-1234567";
        // 주민번호의 합을 구하세요
        // int sum2 = 0;
        // String result7 = jumin.replace("-", "");
        // for(int i = 0; i < result7.length(); i++) {

        // }
        int sum2 = 0;
        for (int i = 0; i < jumin.length(); i++) {
            String numstr = jumin.substring(i, i + 1);
            if (numstr.equals("-"))
                continue;
            sum2 += Integer.parseInt(numstr);
        }
        System.out.println("주민번호 합:" + sum2);

        // 위 주민번호의 합을 구하세요_2
        // String jumin="123456-1234567";
        String[] numarr2 = jumin.replace("-", "").split("");
        int sum3 = 0;
        for (String i : numarr2) {
            sum3 += Integer.parseInt(i);
        }
        System.out.println("주민번호 합2:" + sum3);

        // 위 주민번호의 합을 구하세요_3
        String jumin4 = jumin.replace("-", "");
        int sum4 = 0;
        for (int i = 0; i < jumin4.length(); i++) {
            sum4 += Integer.parseInt(String.valueOf(jumin4.charAt(i)));
        }
        System.out.println("주민번호 합4:" + sum4);

    }

}
