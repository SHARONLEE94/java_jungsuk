package ch06;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width); // cv는 객체 생성 없이 사용이 가능
        System.out.println("Card.height = " + Card.height); // cv는 객체 생성 없이 사용이 가능

        Card c1 =  new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 =  new Card();
        c2.kind = "Space";
        c2.number = 4;

        System.out.println("c1.kind = "+ c1.kind + ", c2.kind = "+ c1.number + ", c1.width = " + c1.width + ", c1.height = " + c1.height);
        System.out.println("c2.kind = "+ c2.kind + ", c2.kind = "+ c2.number + ", c2.width = " + c2.width + ", c2.height = " + c2.height);

        System.out.println("---------------------------------------------------------------------------------------------------------");
        Card.width = 50;
        Card.height = 80;
        System.out.println("c1.kind = "+ c1.kind + ", c2.kind = "+ c1.number + ", c1.width = " + c1.width + ", c1.height = " + c1.height);
        System.out.println("c2.kind = "+ c2.kind + ", c2.kind = "+ c2.number + ", c2.width = " + c2.width + ", c2.height = " + c2.height);
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}