package chap01;

public class _05_VariavleNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        //1. 저장할 값에 어울리는 이름
        //2. 밑줄(_),문자(abc) ,숫자(123) 사용 가능(공백 사용 불가)
        //3.밑줄 또는 문자로 시작 가능
        //4.변수는 한 단어 또는 2개 이상 단어의
        //5.소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        //6.예약어는 사용 불가 (public,static, int , void , double 등)

        //입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String first_name = "봉균"; //이름
        String last_name = "손";
        String date0fBirth = "2001-06-29";//생년월일
        String residentialAddress = "무슨 호텔"; //체류지
        String purpose0fVisit = "관광";//입국 목적
        String flightNo = "KE657";//항공  편명
        String _flightNo = "KE657";//밑줄 시작
        String flight_no_2 = "KE657";//밑줄 시작

        int accompany = 2; //동반 가족 수
        int length0fStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "가방";

        int i = 0;
        String s = "";
        String str = "";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";

        System.out.println();
        System.out.println();
    }
}
