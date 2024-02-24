package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // (전달값1, 전달값2, ...) -> { 코드 }
    }

    //일반 -> 람다식 (1)
    public void print() {
        String s = "test";
        System.out.println(s);
    }

    // () -> {
    //     String s = "test";
    //     System.out.println(s);
    // }

    //일반 -> 람다식 (2)
    public void print2(String s) {
        System.out.println(s);
    }

    // s -> System.out.println(s)

    //일반 -> 람다식 (3)

    public int add(int x, int y) {
        return x+y;
    }

    // (x, y) -> { return x+y; }
    // (x, y) -> x+y
    // 둘은 같은 결과


}
