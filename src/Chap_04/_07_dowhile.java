package Chap_04;

public class _07_dowhile {
    public static void main(String[] args) {
        //반복문 do while

        int distance = 25;
        int move = 0;
        int height = 2;
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        //키가 크면?
        move = 0;
        height = 25; //키가 25m
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        //DO while 반복문
        do{
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리는 : " +move);
        }while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
