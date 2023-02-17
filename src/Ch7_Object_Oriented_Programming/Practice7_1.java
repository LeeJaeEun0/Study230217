package Ch7_Object_Oriented_Programming;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 1. 적절하게 초기화 하시오!
        int j = 1;
        for (int i = 0; i < cards.length; i++) {

            if (j == 1 || j == 3 || j == 8) {
                cards[i] = new SutdaCard(j, true);
                // cards[i].toString();
            } else {
                cards[i] = new SutdaCard(j, false);
                // cards[i].toString();
            } // end of if else
            j = j > 10 ? j - 10 : j++;
        } // end of for i
    }
} // end of class

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩 했다
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
} // end of class

public class Practice7_1 {
    public static void main(String[] args) {

        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i > deck.cards.length; i++) {
            System.out.println(deck.cards[i] + ", ");
        } // end of for i
    } // end of main
} // end of class