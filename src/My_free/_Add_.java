package My_free;

import java.util.Scanner;

public class _Add_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x; //첫 번째 숫자 저장
        int y; //두 번째 저장
        int sum; //합을 저장

        System.out.print("첫번째 숫자를 입력하시오: ");
        x = input.nextInt(); //사용자로 부터 첫 번째 숫자 입력 받음

        System.out.print("두번째 숫자를 입력하시오 ");
        y = input.nextInt();//사용자로 부터 두 번째 숫자 입력 받음

        sum = x + y;

        System.out.println(sum);
    }
}
