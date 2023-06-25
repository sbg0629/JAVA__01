package chap01;

public class _06_Constants {
    public static void main(String[] args) {
        String KR_COUNTRY_CODE = "+82";
       //KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; //원주율 변수에 final을 붙이면 이 변수는 수정할 수 없다는 의미
        final String DATE_OF_BIRTH = "2001-06-29"; //변수에 final을 붙이면 이 변수는 수정할 수 없다는 의미

        System.out.println(DATE_OF_BIRTH);
    }
}
