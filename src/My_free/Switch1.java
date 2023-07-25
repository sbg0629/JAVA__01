package My_free;

import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 7까지의 정수를 입력하세요: ");
        int dayOfWeek = scanner.nextInt();

        String day;

        switch (dayOfWeek) {
            case 1:
                day = "일요일";
                break;
            case 2:
                day = "월요일";
                break;
            case 3:
                day = "화요일";
                break;
            case 4:
                day = "수요일";
                break;
            case 5:
                day = "목요일";
                break;
            case 6:
                day = "금요일";
                break;
            case 7:
                day = "토요일";
                break;
            default:
                day = "잘못된 입력입니다.";
        }

        System.out.println("입력한 숫자는 " + day + "에 해당합니다.");
    }
}

