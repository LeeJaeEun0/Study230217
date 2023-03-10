package Ch7_Object_Oriented_Programming;

class Product {
    int price; // 재품의 시가
    int bonusPoint; // 제품 구매시 제공하는 보너스 점수

    // 기본 생성자가 없을 경우 오류 발생
    // Implicit super constructor Product() is undefined. Must explicitly invoke
    // another constructor
    Product() {
    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
} // end of class

class Tv extends Product {
    Tv() {
    }

    public String toString() {
        return "Tv";
    } // end of toString
} // end of class

public class Practice7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    } // end of main
} // end of class
