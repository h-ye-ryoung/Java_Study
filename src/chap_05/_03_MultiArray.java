package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {

        //다차원 배열 (2차원 배열)

        //소규모 영화관 좌석
        //1차원 배열 3개
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        //3x5 크기의 2차원 배열 선언
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //C5에 접근하려면?
        System.out.println(seats[2][4]);
        //인덱스는 0부터 시작
        //몇번째 배열인지(세로) -> 몇 번째 순서인지(가로) [행][열]

        //첫 줄 3칸, 둘째 줄 4칸, 셋째 줄 5칸인 2차원 배열
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //A3에 접근하려면?
        System.out.println(seats2[0][2]);
        //System.out.println(seats2[0][4]);
        //인덱스가 배열의 범위를 벗어났다는 오류

        //3차원 배열 선언 (세로 x 가로 x 깊이)
        String[][][] marray = new String[][][] {
                { {}, {}, {} },
                { {}, {}, {} },
                { {}, {}, {} }
        };

        //3x3 자판기에 각 음료수가 5개 깊이로 있는 경우
        String[][][] narray = new String[3][3][5];

    }
}
