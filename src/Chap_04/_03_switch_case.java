package Chap_04;

public class _03_switch_case {
    public static void main(String[] args) {
        //switch case

        /*석차에 따른 장학금 지급
         1등 : 전액 장학금
         2등 : 반액 장학금
         3등 : 반액 장학금
         그외 : 장학금 대상 아님
        */

        int ranking = 1; //1등
        if(ranking == 1) {
            System.out.println("전액 장학금");
        }
        else if (ranking == 2){
            System.out.println("반액 장학금");
        }
        else if(ranking == 3){
            System.out.println("반액 장학금");
        }
        else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");
        //switch case

        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }

        }


    }

