package Ch8_Exception_Handling;

public class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(0/0);
            System.out.println(2); // 실행되지 않는다
        } catch(Exception e){
            System.out.println(3); 
        } // end of try catch
        System.out.println(4);
    } // end of main
} // end of class
