package ch05;

public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i : score) {
            sum += i;
        }

        average = sum/(float)score.length;
        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);
    }
}
