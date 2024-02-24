package chap_06;

public class _07_VariableScope {


    public static void method() {
        int result = 1;
    }

    public static void main(String[] args) {

        // System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
        }
        // System.out.println(j);

    }
}
