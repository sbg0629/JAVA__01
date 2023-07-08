package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like java and python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29

        //대소문자 변환
        System.out.println(s.toUpperCase());//모두 대문자 변경

        //소문자 변환
        System.out.println(s.toLowerCase());//모두 소문자 변경

        //포함 관계
        System.out.println(s.contains("java"));//포함되면 true 아니면 false 대소문자 구분해야함.
        System.out.println(s.contains("C#"));
        System.out.println(s.indexOf("java"));//위치 정보
        System.out.println(s.indexOf("C#"));//포함이 안되어 있어서 -1
        System.out.println(s.indexOf("and"));//처음 and
        System.out.println(s.lastIndexOf("and"));//마지막 일치하는 정보
        System.out.println(s.startsWith("I like"));//이 문자열 시작하면 true 아니면 false
        System.out.println(s.endsWith("."));
    }
}
