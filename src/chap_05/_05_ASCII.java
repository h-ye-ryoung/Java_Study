package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {

        //아스키 코드 (ANSI) : 미국 표준 문자 코드
        //알파벳 대문자는 65부터 시작, 소문자는 97부터 시작, 숫자는 48부터 시작

        char c = 'A';
        System.out.println(c);
        System.out.println( (int)c ); //'A'는 아스키 코드 65 (10진수)

        c = 'B';
        System.out.println(c);
        System.out.println( (int)c ); //'B'는 아스키 코드 66 (10진수)

        c++;
        System.out.println(c);
        System.out.println( (int)c ); //'C'는 아스키 코드 67 (10진수)

        //1씩 증가, char 자료형으로 연산을 통해 문자 표현 가능

        c = '0';
        System.out.println(c);
        System.out.println( (int)c ); //'0'은 아스키 코드 48

        c++;
        System.out.println(c);
        System.out.println( (int)c ); //'1'은 아스키 코드 49


        //세로 10x가로 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char eng = 'A';

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(eng) + (j+1);
                System.out.print(seats3[i][j] + " ");
            }
            eng++;
            System.out.println( );
        }

    }
}