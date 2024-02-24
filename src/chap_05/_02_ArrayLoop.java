package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {

        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        //for 반복문 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 한 잔");
        }

        System.out.println("-----");

        //enhanced for (for-each) 반복문
        //배열의 요소를 처음부터 끝까지 순회
        for (String cof : coffees) {
            System.out.println(cof + " 한 잔");
        }

        //그냥 for문은 배열의 인덱스를 이용해 처리해야 하는 작업
        //배열의 모든 요소를 순회할 때는 enhanced for

    }
}
