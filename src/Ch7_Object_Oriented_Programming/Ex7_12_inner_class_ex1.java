package Ch7_Object_Oriented_Programming;

public class Ex7_12_inner_class_ex1 {
    // 인스턴스 내부 클래스
    class InstanceInner{
        int iv = 100;
        // static iv = 100; // 에러! static 변수를 선언 할 수 없다
        final static int CONST = 100; // final static은 상수이므로 허용
    } // end of InstanceInner

    // static 내부 클래스
    static class StaticInner{
        int iv = 200;
        static int cv = 200; // static클래스만 static멤버를 정의할 수 있다
    } // end of StaticInner
    
    void myMethod(){
        // 지역변수
        class LocalInner{
            int iv=200;
            // static int cv = 300; // 에러! static 변수를 선언 할 수 없다
            final static int CONST=300;// final static은 상수이므로 허용
        }// end of LocalInner
    } // end of myMethod()

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    } // end of main
} // end of class
