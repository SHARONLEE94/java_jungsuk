package ch06;

public class Ex6_1 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 7;
        System.out.println(t.channel);
        t.channelUp();
        t.channelUp();
        System.out.println(t.channel);
        t.channelDown();
        System.out.println(t.channel);
    }
}

class Tv {
    String color = "white";
    boolean power = false;
    int channel = 0;

    public void power() { power = !power;}
    public void channelUp() { channel++; }
    public void channelDown() { channel--; }
}