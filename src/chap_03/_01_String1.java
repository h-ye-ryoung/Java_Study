package chap_03;

public class _01_String1 {

    public static void main(String[] args) {

        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함되므로 true
        System.out.println(s.contains("C#")); // 포함되지 않으므로 false
        System.out.println(s.indexOf("Java")); // 위치 정보 -> 7 (index 0부터 시작)
        System.out.println(s.indexOf("C#")); // 포함되어 있지 않으면 -1 반환
        System.out.println(s.indexOf("and")); // 처음으로 만나는 위치
        System.out.println(s.lastIndexOf("and")); // 마지막으로 만나는 위치
        System.out.println(s.startsWith("I like")); // 해당 문자열로 시작되면 true
        System.out.println(s.endsWith(".")); // 해당 문자열로 끝이 나면 true


    }
}
