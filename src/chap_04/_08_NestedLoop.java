package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        // 별 찍기 (5x5 사각형)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----");

        //별 찍기 (왼쪽이 평면인 직각삼각형)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----");

        //별 찍기 (오른쪽이 평면인 직각삼각형)
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i+1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //관점을 다르게 봐야 하는 문제. {공백 연속 반복문+별 연속 반복문} 을 줄바꿈 반복문이 감싼 형태

    }
}
