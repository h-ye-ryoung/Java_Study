package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류: 컴파일 오류, 런타임 오류

        try {
            //시도하려는 소스 코드
            System.out.println(3 / 0);

        } catch (Exception e) {
            //try 단에서 문제가 발생하면 여기 실행
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace(); // 터미널에서 오류 내용과 위치를 알려줌
        }

        // 예외: ArithmeticException

        System.out.println("프로그램 정상 종료");

        try {
            int[] arr = new int[3];
            arr[5] = 100;

        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage()); // 5
            e.printStackTrace();
        }

        // 예외: ArrayIndexOutOfBoundsException

        System.out.println("프로그램 정상 종료");

        try {
            Object obj = "test";
            System.out.println((int) obj);
            // Obj가 어떤 형태일지 모르기 때문에 컴파일 오류는 발생 X

        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            // java.lang.String cannot be cast to java.lang.Integer
            e.printStackTrace();
        }

        // 예외: ClassCastException

        System.out.println("프로그램 정상 종료");
    }
}
