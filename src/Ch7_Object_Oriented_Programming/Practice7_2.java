package Ch7_Object_Oriented_Programming;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard2(num, isKwang);
        } // end of main
    } // end of SutdaDeck()

    // 여기에 메서드 3개를 작성하세요
    // 1. shuffle
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            // int tmp = 0; => 오답
            // 같은 카드형으로 tmp 만들기

            SutdaCard2 tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;

        } // end of for i
    } // end of shuffle()

    // 2. pick - 지저왼 위치의 StudaCard를 반환
    public SutdaCard2 pick(int index) {
        return cards[index];
    } // end of pick

    // 3. pick
    public SutdaCard2 pick() {
        int index = (int) (Math.random() * cards.length);
        return cards[index];
    }
} // end of class

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩 했다
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
} // end of class

public class Practice7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    } // end of main
} // end of class
