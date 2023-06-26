package Chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2 뒤 소숫점 제거
        System.out.println(2 / 4); //0.5 소숫점 제거 0
        System.out.println(4 % 2); //0 나머지
        System.out.println((5 % 2)); //1

        //우선순위
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 + 2) * 2);//8
        System.out.println(2 + (2 * 2)); //6

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);//30

        c = a - b;
        System.out.println(c);//10

        c = a * b;
        System.out.println(c);//200

        c = a / b;
        System.out.println(c);//2

        c = a % b;
        System.out.println(c);//0

        //증감 연산 ++,--
        int val;
        val = 10;
        System.out.println(val);//10
        System.out.println(++val);//11
        System.out.println(val);

        val = 10;
        System.out.println(val);//10
        System.out.println(val++);//10
        System.out.println(val);//11

        val = 10;
        System.out.println(val);//10
        System.out.println(--val);//9
        System.out.println(val);//9

        val = 10;
        System.out.println(val);//10
        System.out.println(val--);//10
        System.out.println(val);//9
     }
}
