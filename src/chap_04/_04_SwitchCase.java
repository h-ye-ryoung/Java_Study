package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {

        // Switch Case
        // 1등: 전액 장학금, 2등/3등: 반액 장학금, 그 외: 장학금 대상 아님

        // if else 문을 이용
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // switch case 문을 이용
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격을 책정 (1급:최상, 4급:최하)
        int grade = 1;
        int price = 7000; //기본 가격

        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 " + price + "원 입니다."); //100원

    }
}
