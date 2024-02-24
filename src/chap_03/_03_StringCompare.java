package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); //true
        System.out.println(s2.equals("python")); //false(대소문자)

        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 없이 문자열 내용이 같은지

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false !!

        // equals는 참조하는 곳의 내용을 비교하는 것, ==는 참조(메모리 주소값)가 같은지를 비교하는 것(완전히 같아야 ==)
        // 새 객체를 생성하게 되면 서로 다른 메모리에 저장되어 참조하는 주소가 다르게 됨
        // 새 객체 생성 말고 그냥 " "로 문자열 부여할 경우에는 같은 문자열일 경우 같은 메모리 주소를 씀
        // 즉 고정된 "1234" 문자열 공간이 있고(따로 만들지 않고) 그 공간을 s1, s2라는 변수가 "참조"하는 것. 똑같은 주소를 참조하고 있음

    }
}
