package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        //값을 설정하지 않았을 때 기본값

        // 기본 자료형(Primitive Data Types)의 경우 (int, float, ..)
        int[] i = new int[3];
        System.out.println(i[0]); // 0 (int, long의 경우)

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0 (double, float의 경우)

        boolean[] bool = new boolean[3];
        System.out.println(bool[0]); // false

        //참조 자료형(Non-Primitive, Reference Data Types)의 경우 (String.. )
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0]);

        System.out.println("-----");

        int a = 10;
        int b = 20;
        b = a; // a의 값을 복사해 대입했을 뿐, a는 10으로 유지
        System.out.println(a + ", " + b); // 10, 10

        b = 30;
        System.out.println(a + ", " + b); // 10, 30

        System.out.println("-----");

        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1";
        c2.name = "카메라2";

        System.out.println(c1.name + ", " + c2.name); // 카메라1, 카메라2

        c2 = c1;
        System.out.println(c1.name + ", " + c2.name); // 카메라1, 카메라1

        c2.name = "고장난 카메라";
        System.out.println(c1.name + ", " + c2.name); // 고장난 카메라, 고장난 카메라

        System.out.println("-----");

        changName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

    }

    public static void changName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
