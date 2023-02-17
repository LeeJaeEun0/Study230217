package Ch7_Object_Oriented_Programming;

public class Ex7_11_default_static_method {
    public static void main(String[] args) throws Exception {
        Child3 c = new Child3();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    } // end of main
} // end of class

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in child"); // 오버라이딩
    } // end of method()

} // end of class

class Parent3 {
    public void method2() {
        System.out.println("method2() in Parent3"); // 오버라이딩
    } // end of method()
} // end of class

interface MyInterface {
    default void method1() {
        System.out.println("method1() in myInterface ");
    } // end of method1

    default void method2() {
        System.out.println("method2() in myInterface ");
    }// end of method2

    static void staticMethod() {
        System.out.println("method1() in myInterface ");
    }// end of staticMethod()
} // end of interface

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    } // end of method1

    static void staticMethod() {
        System.out.println("staicMethod() in MyInterface2");
    }// end of staticMethod
} // end of interface