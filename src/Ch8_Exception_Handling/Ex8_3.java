package Ch8_Exception_Handling;

public class Ex8_3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행되지 않는다
        } catch (Exception e) { // ArithmeticException 대신 Excepion으로 사용
            System.out.println(5);
        } // end of try catch
        System.out.println(6);
    } // end of main
} // ennd of class
