package chap_06;

public class _01_Method {

    // 간단한 메소드 정의하기, 동작을 하는 코드
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }


    public static void main(String[] args) {

        // 메소드 호출하기
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");

    }
}
