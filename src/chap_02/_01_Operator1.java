package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 더하기
        System.out.println(4 - 2); // 빼기
        System.out.println(4 * 2); // 곱하기
        System.out.println(4 / 2); // 나누기
        System.out.println(5 / 2); // 정수 간 계산에서는 결과도 정수, 소수점이 버려짐 -> 2
        System.out.println(2 / 4); // 0
        System.out.println(5 % 2); // 나머지

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val = 10;
        val++; // 문장의 연산을 수행하고 나서 1 더하는 연산 수행
        ++val; // 1 더하는 연산 후 문장 수행

        val = 10;
        System.out.println(++val); //11
        System.out.println(val++); //11
        System.out.println(val); //12

        val = 10;
        System.out.println(--val); //9
        System.out.println(val--); //9
        System.out.println(val); //8

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 0, 다음 사람은 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 1, 다음 사람은 2
        System.out.println("총 대기 인원 : " + waiting);


    }
}
