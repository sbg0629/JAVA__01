package My_free;

import java.util.Scanner;

public class box {
    public static void main(String[] args) {
        double w;
        double h;
        double area;
        double perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("사각형의 가로");
        w = input.nextInt();
        System.out.print("사각형의 세로");
        h = input.nextInt();

        area = w * h;

        perimeter = 2.0 *(w + h);

        System.out.println("사각형의 넓이는" + area);
        System.out.println("사각형의 둘레는" + perimeter);
    }
}
