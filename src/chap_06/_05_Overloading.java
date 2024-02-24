package chap_06;

public class _05_Overloading {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        int result = number * number;
        return result;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println( getPower(3) ); // 3*3 = 9
        System.out.println( getPower("4") ); // 4*4 = 16
        System.out.println( getPower(3,3) ); // 3*3*3 = 27

    }
}
