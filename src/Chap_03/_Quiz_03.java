package Chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        /*퀴즈3.
        주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오
        -주민등호는 13자리의 숫자로 구성
        -앞 6자리는 생년월일정보 , 뒷 7자리 중 첫 번째 숫자는 성별졍보
        -입력 데이터는 -을 포함한 14자리의 분자열 형태

        예시 "901231-1234567"인경우 901231-1까지만 출력
        */

        String n = "901231-1234567";
        System.out.println(n.substring(n.indexOf("9"),(n.lastIndexOf("2"))));
        System.out.println(n.substring(0,8));
    }
}
