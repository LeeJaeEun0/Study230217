package Ch8_Exception_Handling;

public class Ex8_5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0); // 예외 발생!
            System.out.println(4); // 실행되지 않는다
        } catch (ArithmeticException ae) {
            ae.printStackTrace(); // 예외에 대한 정보를 얻을 수 있음
            System.out.println("예외 메시지 : " + ae.getMessage()); // 예외에 대한 발생원인을 알 수 있음
        } // end of try catch

        System.out.println(6);

    } // end of main

} // end of class
