package Chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수 문자.이스케이프 문자
        //\n,\t,\\,\"

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요");// \n 줄 바꿈

        //해물파전 9000원
        //김치전 8000원
        //부추전 8000원

        System.out.println("해물파전\t9000원"); //\t : 탭
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        System.out.println("C:\\Profram Files\\java"); // \\: 역슬래시

        //단비가 "냐옹"이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요"); // \" : 큰따음표 출력

        System.out.println("단비가 \'냐옹\' 이라고 했어요");
        System.out.println("단비가 '냐옹' 이라고 했어요");

        char c= 'A';
        c= '\'';
        System.out.println(c);
    }
}
