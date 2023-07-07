package Chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        //결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과 값)

        int x = 5;
        int y = 3;
        int max = (x > y) ?  x : y; // 최대 값을 찾음
        System.out.println(max);

        int main = (x < y) ? x : y; // 작은 값
        System.out.println(main);

        boolean b = (x == y) ? true : false;// 값으면 true 다르면 false
        System.out.println(b);

        String s = (x != y)? "달라요":"같아요";
        System.out.println(s);
    }
}
