package My_free;

public class continue_ {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {//1~100까지

            if (i % 5 == 0 || i % 7 == 0) { // 5의 배수와 7의 배수를 모두 출력하는 예제입니다.

                System.out.println(i);

            } else {

                continue;

            }
        }
    }
}
