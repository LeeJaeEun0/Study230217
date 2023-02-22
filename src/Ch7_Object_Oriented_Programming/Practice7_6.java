package Ch7_Object_Oriented_Programming;

import Ch7_Object_Oriented_Programming.Outer.Inner;

class Outer {
    class Inner {
        int iv = 100;
    } // end of inner class
} // end of outer class

public class Practice7_6 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(i.iv);
    } // end of main
} // end of class
