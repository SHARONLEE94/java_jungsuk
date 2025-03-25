package ch04;

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1과 100사이의 정수를 입력하세요 >>");
            input = sc.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if(input < answer) {
                System.out.println("더 큰수를 입력하세요");
            }
        }while (answer != input); // input이 변수 answer의 값과 다른 동안 반복하다 두 값이 같으면 반복 종료

        System.out.println("정답입니다.");
    }
}
