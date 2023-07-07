package Chap_02;

import java.sql.SQLOutput;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자.
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //|| = OR 하나라도 true 면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // && = and 모두 true 면 true

        System.out.println((5 > 3) && (3 >1)); //true
        System.out.println((5 > 3) && (3 <1)); //false

        System.out.println((5 > 3) || (3 <1)); //true
        System.out.println((5 < 3) || (3 <1)); //false

        System.out.println(!true); // false = true 의 반대
        System.out.println(!false); // true = false 의 반대
    }
}
