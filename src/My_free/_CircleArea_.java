package My_free;

import java.util.Scanner;

public class _CircleArea_ {
    public static void main(String[] args) {

        double radius; //원의 반지름
        double area; //원의 면적

        Scanner input = new Scanner(System.in);

        System.out.print("반지름 입력 하시오 ");
        radius = input.nextDouble();
        area = 3.14 * radius * radius;

        System.out.println("원의 면적은 " + area);
    }
}
