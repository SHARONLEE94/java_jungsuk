package ch02;

public class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";

        System.out.println(str.charAt(0) - '0'); // 숫자
        System.out.println('3' - '0' +1); // 숫자
        System.out.println(Integer.parseInt("3") + 1); // 숫자
        System.out.println("3" + 1); // 문자
        System.out.println((char)(3+'0')); // 숫자
    }
}
