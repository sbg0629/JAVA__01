package Chap_04;

public class _05_for {
    public static void main(String[] args) {
        //반복문 for
        //나코 매장
        System.out.println("안녕하세요, 나코 매장입니다.");

        //또다른 손님이 들어오면 *5
        for (int i = 0  ; i < 10  ; i++) {
            System.out.println("안녕하세요 나코 입니다." + i);
        }

        //짝수 출력
        for (int i = 0; i < 10 ; i+= 2){
            System.out.println(i);
        }

        //홀수만
        for (int i = 1; i < 10; i+=2 ){
            System.out.println(i);}
        for (int i = 5; i > 0; i-- ){
            System.out.print(i);
        }
        int sum = 0;
        for (int i = 1; i <= 10 ; i++){
            sum += i;
            System.out.println(sum);}

    }

}
