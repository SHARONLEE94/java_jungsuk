package ch04;

public class Ex4_13 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

//        while (sum < 100) {
//            sum += i;
//            if(sum < 100) {
//                System.out.println(i + " - " + sum);
//            }
//            ++i;
//        }
        while (sum < 100) {
            System.out.println(i + " - " + sum);
            sum += ++i;
        }
    }
}
