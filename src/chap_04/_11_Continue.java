package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue
        //치킨 주문 손님 중에 노쇼 손님이 있다고 가정

        //for 반복문
        int max = 20; //최대 치킨 판매 수량
        int sold = 0; //현재 판매 치킨 수량
        int noShow = 17; //대기번호 17번 손님이 노쇼
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            //손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; //즉시 동작을 멈추고 다음 반복 실행 (만나면 밑의 코드는 실행하지 않고, 반복문 처음으로 돌아가서 다음 증감으로 넘어감)
            }

            sold++; //판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("----------");

        //while 반복문
        int index = 0; //손님 번호
        sold = 0;
        while (index < 50) {

            index++; //수동 증감, continue 때문에 앞에서 증가시켜줌
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            //손님이 없다면 (noShow)
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; //반복문 처음으로 돌아가서 다음 조건 확인으로 넘어감
            }

            sold++; //판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

    }
}
