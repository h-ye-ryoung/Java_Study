package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자 public, protected, default, private

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.setPrice(-5000);
        // b1.resolution = "FHD";

        System.out.println("가격: " + b1.getPrice()); // -5000
        System.out.println("해상도: " + b1.resolution); // null

        System.out.println("------");

        // 실수 발생 -> 해결
        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setPrice(-5000);
        // b2.setResolution = "FHD";

        System.out.println("가격: " + b2.getPrice()); // 최소 금액 적용
        System.out.println("해상도: " + b2.getResolution()); // 값이 없을 때 대처

    }
}

