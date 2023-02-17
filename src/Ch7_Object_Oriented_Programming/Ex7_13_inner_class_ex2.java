package Ch7_Object_Oriented_Programming;

public class Ex7_13_inner_class_ex2 {
    class InstanceInner{}
    static class StaticInner{}

    // 인스턴스멤버 간에는 서로 직접 접근이 가능 합니다.
    InstanceInner iv = new InstanceInner();
    //static 멤버 간에는 서로 직접 접근이 가능 합니다.
    StaticInner cv = new StaticInner();

    static void  staticMethod(){
        // static멤버는 인스턴스 멤버에 직접 접근할 수 없다.
        // InstanceInner obj1 = new InstanceInner();
        // StaticInner obj2 = new StaticInner();

        // 굳이 접근하려면 아래에 같이 객체를 생성해야한다.
        //인스턴스 클래스는 외부
    } // end of staticMethod()


    public static void main(String[] args) {
        
    } // end of main
} // end of class
