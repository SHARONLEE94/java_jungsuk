package ch04;

public class Ex4_17 {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 11) {
//            if(i % 3 !=0) {
//                System.out.println(i);
//            }
//            i++;
//        }

        for(int i = 0; i <= 10; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
