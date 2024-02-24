package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
            // System.out.println(3 / 0);

            //int[] arr = new int[3];
            // arr[5] = 100;

            //Object obj = "test";
            //System.out.println((int) obj);

            String s = null;
            System.out.println(s.toLowerCase());

        } catch (ArithmeticException e) {
            System.out.println("뭔가 잘못 계산을 하셨네요.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스를 잘못 설정했어요.");

        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환입니다.");

        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
            e.printStackTrace();
        } // 나열된 예외들이 아닐 때

        System.out.println("프로그램 정상 종료");

        // 여러 타입의 예외를 한번에 catch
        try {
            System.out.println(3 / 0);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 잘못 계산을 하셨네요.");

        }
    }
}

// Exception : 모든 예외들의 조상 클래스
// 예외별로 다른 catch 문을 별도로 작성할 수 있음
// 여러 개의 catch 문: 위에서부터 내려오다 하나의 catch에 걸리면 try-catch 구문 종료
