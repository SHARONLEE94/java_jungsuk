package ch03;

public class Ex3_2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++; // 참조하여 대입 후에 증가
        System.out.println("j=i++ 실행 후, i="+i+", j="+j);

        i=5;
        j=0;

        j=++i; // 증가 후에 참조하여 대입
        System.out.println("j=++i 실행 후, i="+i+", j="+j);
    }
}
