package Chap_04;

public class _02_else {
    public static void main(String[] args) {
        //조건문 If else
        int hour = 15;
        if (hour < 14 ){ //오후 2시 이전이면
            System.out.println("아이스 아메리카노 +1");
        }
        else { //그 외의 경우
            System.out.println("아이스 아메리카노 (디 카페인) +1 ");
        }
        System.out.println("커피 주문 완료 #1");

        //오후 2시 이후거나 모닝 커피를 마시는 경우?

        hour = 15;
        boolean morning = true;
        if (hour >= 14 || morning == true){
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");
        }
    }

