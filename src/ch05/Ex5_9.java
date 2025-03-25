package ch05;

public class Ex5_9 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균 ");
        System.out.println("===============================");

        for(int i=0; i<score.length; i++) {

        }

        System.out.println("===============================");
        System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}
