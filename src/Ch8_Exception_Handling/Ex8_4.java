package Ch8_Exception_Handling;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(args[0]);
            // System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다
        } catch (ArithmeticException ae) { // 에러가 일치하는 경우
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException aei) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) { // 모든 예외의 처리 가능 (모든 예외의 최고 조상)
            System.out.println("Exception");  
        } // end of try catch
        System.out.println(6);
    } // end of main
} // end of class 
