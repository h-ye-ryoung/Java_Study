package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
        } catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }

        System.out.println("----");

        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        } // 따로 예외 처리 없이 프로그램 정상 종료

        // 원래는 오류 발생시 프로그램이 종료되는데,
        // try 문에 넣었기 때문에 에러가 발생했음에도 불구하고 다음 문장으로 넘어감
    }
}

// 택시를 타던지(try), 휴무 택시라서 못 타던지(오류: catch), 어쨌든 문은 닫아줘야 함.
    // ex) 연결했던 DB connetcion 닫기, 열었던 파일 닫기, 임시 파일 삭제...
// 문제가 발생하건 말건 무조건 마지막에 실행되어야 하는 구문 -> finally

// 구성 (try 단독 x)
// try + catch(s)
// try + catch(s) + finally
// try + finally



