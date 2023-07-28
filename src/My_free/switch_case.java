package My_free;

import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        int jumsu = 0;

        Scanner scanner = new Scanner(System.in);    // 점수를 입력받기 위해 scanner사용
        System.out.print("임의의 숫자를 입력하세요: ");

        jumsu = scanner.nextInt();
        System.out.println("점수 : " + jumsu);
        scanner.close();    // scanner 닫기

        char grade;
        switch(jumsu / 10)    // 입력받은 점수를 10으로 나누어 몫을 정수만 받기
        {
            // 100 ~ 90이면 A학점
            case 10:
            case 9:
                grade = 'A';
                System.out.println("입력된 점수 " + jumsu + "점은 " + grade + "학점 입니다.");
                break;

            // 80점대이면 B학점
            case 8:
                grade = 'B';
                System.out.println("입력된 점수 " + jumsu + "점은 " + grade + "학점 입니다.");
                break;

            // 70점대이면 C학점
            case 7:
                grade = 'C';
                System.out.println("입력된 점수 " + jumsu + "점은 " + grade + "학점 입니다.");
                break;

            // 60점대이면 D학점
            case 6:
                grade = 'D';
                System.out.println("입력된 점수 " + jumsu + "점은 " + grade + "학점 입니다.");
                break;

            // 60점 미만은 F학점
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                grade = 'F';
                System.out.println("입력된 점수 " + jumsu + "점은 " + grade + "학점 입니다.");
                break;

            // 이외에 점수를 입력했을 때 디폴트
            default:
                System.out.println("잘못된 점수 입력입니다");
        }
    }
}
