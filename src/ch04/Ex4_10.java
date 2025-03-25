package ch04;

public class Ex4_10 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i <= 5; i++ ) {
            sum += i;
            System.out.println("1부터 " + i + "까지의 합: " + sum);
        }
    }
}
