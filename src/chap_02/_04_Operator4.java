package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {

        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // or 조건, 하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // and 조건, 모두 true여야 true

        // and 연산
        System.out.println((5 > 3) && (3 > 1)); //true
        System.out.println((5 > 3) && (3 < 1)); //false

        // or 연산
        System.out.println((5 > 3) || (3 > 1)); //true
        System.out.println((5 > 3) || (3 < 1)); //true
        System.out.println((5 < 3) || (3 < 1)); //false

        // 1 < 3 < 5 처럼 연속적인 비교는 오류, 1 < 3 && 3 < 5 로 표현해야 함

        // 논리 부정 연산자
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true

    }
}
