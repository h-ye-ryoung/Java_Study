package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {

        // 실수 발생
        BlackBox b1 = new BlackBox();
        b1.price = -5000;
        // b1.resolution = "FHD";

        System.out.println("가격: " + b1.price); // -5000
        System.out.println("해상도: " + b1.resolution); // null

        System.out.println("------");

        // 실수 발생 -> 해결
        BlackBox b2 = new BlackBox();
        b2.setPrice(-5000);
        // b2.setResolution = "FHD";

        System.out.println("가격: " + b2.getPrice()); // 최소 금액 적용
        System.out.println("해상도: " + b2.getResolution()); // 값이 없을 때 대처

    }
}
