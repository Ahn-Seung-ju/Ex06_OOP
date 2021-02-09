package Day0208;

public class Ex02_Exception {

    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        System.out.println("main start");
        
        
        
        try {
            for(int i = 0; i < 10; i++) {
                result = num / (int)(Math.random()*10);
                System.out.println("result: " + result + "i: " + i);
            }
        }catch (ArithmeticException e) {//하위 예외(구체화, 특수화) 먼저 선언 후 상위 예외 선언
            System.out.println("문제 발생");
            System.out.println("원인: " + e.getMessage());
        } catch (NullPointerException e) {//하위 예외 먼저 선언
            
        }catch(Exception e) {//부모 타입
            //ArithmeticException 아니고 NullPointerException 아닌 나머지 예외 다 잡겠다
        }
            
            
        
        
        
        
        
        System.out.println("main end");
        

    }

}
