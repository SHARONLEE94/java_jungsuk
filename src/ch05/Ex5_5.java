package ch05;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
        }

        int tmp = 0;
        int j = 0;

        for(int i=0; i<6; i++) {
            j = (int)(Math.random()*44);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for(int i = 0; i < 6; i++) {
            System.out.println("ball["+i+"]=" + ball[i]);
        }
    }
}
