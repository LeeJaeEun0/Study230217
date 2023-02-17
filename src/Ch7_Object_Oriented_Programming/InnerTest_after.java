package Ch7_Object_Oriented_Programming;

class AAA { // AAA는 BBB의 외부 클래스
    int i = 100;
    BBB b = new BBB();

    class BBB { // BBB는 AAA의 내부 클래스
        void method() {
            // AAA a = new AAA();
            // System.out.println(A.i);
            System.out.println(i); // 객체 생성 없이 외부 클래스의 멤버 접근가능
        } // end of method
    } // end of class

} // end of class

// class CCC{
// BBB b = new BBB();
// } // end of class

public class InnerTest_after {
    public static void main(String[] args) {
        // BBB B = new BBB();
        // B.method();
        // 내부 클래스는 외부클래스의 멤버 처럼 사용 된다
    } // end of main
} // end of class
