package My_free;

import java.util.Scanner;

public class _case_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("등급을 입력하세요: ");
        String score = sc.next();

        switch (score) {
            case "A":
                System.out.println("A등급입니다.");
                break;
            case "B":
                System.out.println("B등급입니다.");
                break;
            case "C":
                System.out.println("C등급입니다.");
                break;
            default:
                System.out.println("D등급 이하 입니다.");
                break;
        }
    }
}