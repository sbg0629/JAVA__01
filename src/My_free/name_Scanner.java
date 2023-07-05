package My_free;

import java.util.Scanner;

public class name_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner객체 생성

        System.out.println("이름을 입력하세요: ");//입력받기
        String name = scanner.nextLine(); //메서드를 사용하여 사용자가 입력한 한 줄을 문자열로 읽음.

        System.out.println("입력한 이름은 "+name+" 입니다.");

        scanner.close();//scanner 객체 닫기.


    }

}
