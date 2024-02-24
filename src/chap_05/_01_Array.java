package chap_05;

public class _01_Array {
    public static void main(String[] args) {

        // 배열 선언 첫 번째 방법
        String[] coffees1 = new String[4];

        // 배열 선언 두 번째 방법
        String coffees2[] = new String[4];

        // -> 배열에 값 대입
        coffees1[0] = "아메리카노"; // 배열의 인덱스 0에 값 대입
        coffees1[1] = "카페모카";
        coffees1[2] = "카페라뗴";
        coffees1[3] = "카푸치노";

        // 배열 선언 세 번째 방법
        String[] coffees3 = new String[] {"아메리카노", "카페모카", "카페라뗴", "카푸치노"};
        // 중괄호에 해당하는 값 개수만큼의 공간을 만듦, []에 숫자를 넣으면 오류

        // 배열 선언 네 번째 방법
        String[] coffees4 = {"아메리카노", "카페모카", "카페라뗴", "카푸치노"};

        // 배열 값 사용
        // 커피 주문
        System.out.println(coffees4[0] + "," + coffees4[1] + "," + coffees4[2] + "," + coffees4[3]);

        // 배열의 값 바꾸기
        coffees4[2] = "에스프레소";
        System.out.println(coffees4[0] + "," + coffees4[1] + "," + coffees4[2] + "," + coffees4[3]);

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};

    }
}
