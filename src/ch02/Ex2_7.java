package ch02;

public class Ex2_7 {
    public static void main(String[] args) {
        // 문자열 결합
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);

        // 덧셈 연산자는 왼쪽에서 오른쪽 방향으로 연산을 수행하기 때문에 결합순서에 따라 결과가 달라짐
        System.out.println(" " + 7);
        System.out.println("" + 7);
        System.out.println( 7 + 7 +"" );
    }
}
