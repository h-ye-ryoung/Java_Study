package chap_04;

public class _01_If {
    public static void main(String[] args) {

        // 조건문 If
        int hour = 15; // 오전 10시

        // 오후 2시 이전이면 커피 먹기
        if ( hour < 14 ) {
            System.out.println("아이스 아메리카노 먹기");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 1");

        // 오후 2시 이전이면서 모닝커피를 마시지 않은 경우에만 커피 먹기
        hour = 10;
        boolean morningCoffee = false;

        if (hour < 14 && !morningCoffee) {
                         //morningCoffee == false와 같은 문장
            System.out.println("아이스 아메리카노 먹기");
        }
        System.out.println("커피 주문 완료 2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우에는 디카페인 먹기
        hour = 15;
        morningCoffee = true;

        if (hour >= 14 || morningCoffee) {
                          //morningCoffee == true와 같은 문장
            System.out.println("디카페인 먹기");
        }
        System.out.println("커피 주문 완료 3");

    }
}
