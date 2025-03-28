package ch06;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long res1 = mm.add(5l, 3l);
        long res2 = mm.substract(5l, 3l);
        long res3 = mm.multiply(5l, 3l);
        double res4 = mm.divide(5l, 3l); // double 대신 long 값으로 호출 -> 자동형변환 됨
        long res5 = mm.max(15, 10);
        long res6 = mm.abs(24);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println("-------------------");
        mm.printGugudan(3);
    }
}
class MyMath {
    void printGugudan(int dan) {
        if(!(dan >= 2 && dan <= 9)) {return;}

//        for(int i = 1; i <= 9; i++) {
//            int[] res = new int[9];
//            res[i-1] = dan*i;
//            System.out.println(res[i-1]);
//        }

        for(int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d\n" , dan, i, dan*i);
        }
    }
    long add (long a, long b) {
        return a + b;
    }
    long substract (long a, long b) {
        return a - b;
    }
    long multiply (long a, long b) {
        return a * b;
    }
    double divide (double a, double b) {
        return a / b;
    }
    long max(long a, long b) {
//        return Math.max(a,b);
        return a > b ? a : b;
    }
    long abs(long a) {
        return a < 0 ? -a : a;
    }
}
