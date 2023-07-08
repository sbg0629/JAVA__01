package Chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "Python";

        System.out.println(s1.equals("java"));//문자열 내용이 같으면 true

        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 구분 없이

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지 비밀번호 (참조)
        s2 = "1234";

        System.out.println(s1.equals(s2)); //내용
        System.out.println(s1 == s2); //참조

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); //서로 참조가 다름
    }
}
