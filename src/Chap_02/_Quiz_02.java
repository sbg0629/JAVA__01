package Chap_02;

public class _Quiz_02 {
    //퀴즈2
    //어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인 하는 프로그램을 작석하시오.

    /*조건
    키가 120cm 이상인 경우에만 탑승 가능
    삼항 연산자 이용*/

    /* 실행결과
       키가 115cm이므로 탑승 불가능 합니다 ,값이 115인 경우
       키가 121cm이므로 탑승 가능합니다. ,값이 121인경우.
     */

    public static void main(String[] args) {
        int a = 115; //a의 키
        int b = 121; //b이 키

        String result = (a >= 120) ? "탑승 가능합니다" : "탑승 불가능 합니다.";
        System.out.println("키가 "+ a + "cm 이므로 " + result);

        String result1 = (b >= 120) ? "탑승 가능합니다" : "탑승 불가능 합니다.";
        System.out.println("키가 "+ b + "cm 이므로 " + result1);



    }
}
