package chap_04;

public class _05_For {
    public static void main(String[] args) {

        // 반복문 for
        
        // 인사 반복
        for (int i=0; i<10; i++) {
            System.out.println("어서오세요. 나코입니다." + i);
        }
        
        // 짝수만 출력
        for (int i = 0; i < 10 ; i += 2) {
            System.out.print(i); // 줄바꿈하지 않음
        }

        System.out.println(); // 줄바꿈

        // 홀수만 출력
        for (int i = 1; i < 10 ; i += 2) {
            System.out.print(i);
        }

        System.out.println(); // 줄바꿈

        // 거꾸로 출력
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1부터 10까지 수들의 합
        int result = 0;
        for (int i=1; i<=10; i++) {
            result += i;
        }
        System.out.println(result);


    }
}
