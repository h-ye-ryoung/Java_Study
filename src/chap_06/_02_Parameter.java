package chap_06;

public class _02_Parameter {

    // n의 제곱을 구하는 메소드
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + "의 제곱은 " + result);
    }

    // n의 m제곱을 구하는 메소드
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "제곱은 " + result);
    }

    public static void main(String[] args) {

        // 전달값, Parameter
        // 거듭제곱 계산 프로그램
        power(2);
        power(4);

        powerByExp(2,3); //8
        powerByExp(3,4); //81
        powerByExp(10,0); //1

    }
}
