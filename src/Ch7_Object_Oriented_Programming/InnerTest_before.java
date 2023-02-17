package Ch7_Object_Oriented_Programming;

class AAA {
    int i = 100;
    BBB b = new BBB();
} // end of class

class BBB {
    void method() {
        AAA a = new AAA();
        System.out.println(a.i);
    } // end of method
} // end of class

class CCC {
    BBB b = new BBB();
} // end of class

public class InnerTest_before {
    public static void main(String[] args) {
        BBB B = new BBB();
        B.method();
    } // end of main
} // end of class
