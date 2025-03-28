package ch06;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1: " + t1.channel + ", t2: " + t2.channel);
        t1.channel = 6;
        System.out.println("t1: " + t1.channel + ", t2: " + t2.channel);
    }
}
