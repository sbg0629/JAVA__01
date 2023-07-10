package Chap_04;

public class _03_else_if {
    public static void main(String[] args) {
        //조건문 else if

        //한라봉 에이드가 있으면 +1
        //또는 망고 주스 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongade = true;
        boolean mango = true;

        if(hallabongade){
            System.out.println("한라봉 에이드 +1");
        }
        else if(mango){
            System.out.println("망고 주스 +1");
            }
        else {
            System.out.println("아이스 아메리카노");
        }
        System.out.println("커피 주문 완료");
        }
    }

