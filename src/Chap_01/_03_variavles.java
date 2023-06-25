package chap01;

public class _03_variavles {
    public static void main(String[] args) {
        String name; // S 대문자 name이라는 문자열 변수 선언
        name = "손봉균"; //String name = "손봉균" 가능
        int  hour = 15;


        System.out.println(name + "님, 배송이 시작됩니다. "+ hour +"시에 방문 예정입니다."); // + 해야함. + hour + 양쪽 합침
        System.out.println(name + "님, 배송이 완료 되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "홍길동";
        System.out.println(name + "님의 평균 점수는"+score+"점 입니다");//홍길동 출력 name 업데이트
        System.out.println("학점은"+grade+ "입니다.");

        boolean pass = true; //참 거짓
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d = 3.14123456789; //float 보다 정밀한 값 위해서 double 써야함.
        float f = 3.14123456789F;//float자료형 을 위해서는 실수 값 뒤에 F값 넣어야함.
        System.out.println(d);
        System.out.println(f);

        //int i = 1000000000000; 범위초과로 안됌.
        long i = 10000000000L; //큰 값을 넣기 위해서는 뒤에 L붙혀야함.
        i = 1_00000_0000_0L; // 상관없음 보기 편하게 만들기 위해서
        System.out.println(i);


    }
}
