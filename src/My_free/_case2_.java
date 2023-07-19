package My_free;

import java.util.Scanner;

public class _case2_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("A등급입니다.");
        } else if (score >= 70 && score < 80) {
            System.out.println("B등급입니다.");
        } else if (score >= 60 && score < 70) {
            System.out.println("C등급입니다.");
        } else {
            System.out.println("D등급 이하입니다.");
        }
    }
}
