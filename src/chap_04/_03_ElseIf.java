package chap_04;

import java.lang.ref.PhantomReference;

public class _03_ElseIf {
    public static void main(String[] args) {

        // 조건문 else if
        // 한라봉 에이드가 있으면 +1, 망고 주스가 있으면 +1, 다 없으면 아아 +1

        boolean hallabongAde = false;
        boolean mangoJuice = false;

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 주문");
        } else if (mangoJuice == true) {
            System.out.println("망고 주스 주문");
        } else {
            System.out.println("아이스 아메리카노 주문");
        }
        System.out.println("커피 주문 완료 #1");

        //else if는 여러번 사용 가능

        boolean orangeJuice = false;

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 주문");
        } else if (mangoJuice == true) {
            System.out.println("망고 주스 주문");
        } else if (orangeJuice == true) {
            System.out.println("오렌지 주스 주문");
        } else {
            System.out.println("아이스 아메리카노 주문");
        }
        System.out.println("커피 주문 완료 #2");

        // else는 없어도 가능

        if (hallabongAde == true) {
            System.out.println("한라봉 에이드 주문");
        } else if (mangoJuice == true) {
            System.out.println("망고 주스 주문");
        } else if (orangeJuice == true) {
            System.out.println("오렌지 주스 주문");
        }
        System.out.println("커피 주문 완료 #3");

    }
}
