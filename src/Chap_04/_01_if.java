package Chap_04;

public class _01_if {
    public static void main(String[] args) {
        //조건문 if
        int hour = 10; //오전 10시
        if(hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }//{}안에 넣어야지 두개 문장 출력
        System.out.println("커피 주문 완료");

        //오후 2시 이전, 모닝 커피를 마시지 않는 경우?
        hour = 10;
        boolean morningcoffee = false; //모닝커피
        if(hour <14 && morningcoffee == false){ //!morningcoffee
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이후이거나 모닝 커피를 마시는 경우

        hour = 15;
        morningcoffee =true;
        if (hour >= 14 || morningcoffee == true){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
    }





}
