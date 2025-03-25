package ch02;

public class Ex2_6 {
    public static void main(String[] args) {
        int x = 100; // 정수를 저장하기 위한 타입 - 20억이 넘을 땐 long
//        double pi = 3.14; // float는 오차없이 7자리, double은 15자리
        float pi = 3.14f; // float는 오차없이 7자리, double은 15자리
        char ch = 'a';
        String str = "abc";

        System.out.println(x);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(str);
    }
}
