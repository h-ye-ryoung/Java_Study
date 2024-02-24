package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        // 주차요금 시간당 4000원 (일일 최대 요금 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        int hour = 5;
        boolean isSmallCar = false; //경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000; //주차 요금

        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");

    }
}
