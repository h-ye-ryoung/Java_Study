package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
        // int result = number * number;
        // return result;

        // 메소드 내에서 또다른 메소드를 호출해서 값을 받아올 수도 있음
        // 본인이 인자로 받은 number을 다른 메소드의 인자로 넣어주는 형태
        return getPower(number,2);
    }

    public static int getPower(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {

        // 메소드가 필요한 이유
        // 값만 달라지고, 같은 동작을 반복하는 경우

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        // 2의 2승을 구하기 (메소드)
        System.out.println(getPower(2,2));

        // 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);

        // 4의 2승을 구하기 (메소드)
        System.out.println(getPower(4,2));
    }
}
