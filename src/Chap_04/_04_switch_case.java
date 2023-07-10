package Chap_04;

public class _04_switch_case {
    public static void main(String[] args) {
        //중고 상품의 등급에 따른 가격 책정 (1급 최상, 4긍 최하)
         int gread = 1;
         int price = 7000;

         switch (gread){
             case 1:
                 price += 1000;
             case 2:
                 price += 1000;
             case 3:
                 price += 1000;
                 break;
         }
        System.out.println(gread + "등급 제품의 가격 : " + price + "원" );

    }
}
