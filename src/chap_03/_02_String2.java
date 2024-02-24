package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); //" and"를 ","로 변환
        System.out.println(s.substring(7)); //7번째 index부터 문자열 시작 (잘라내기)
        // s 문자열에 반영되지는 않음, 값을 s에 저장해야 반영됨 (s = s.substring(7))
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(7,28)); // 시작 인덱스부터 끝 인덱스 "직전"까지, 끝 인덱스 문자는 포함하지 않음
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // Java 부터 . 전까지

        // 공백 제거
        s = "        I love Java.     ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        // 문자열 결합 메소드
        System.out.println(s1.concat(", ").concat(s2));
    }
}
