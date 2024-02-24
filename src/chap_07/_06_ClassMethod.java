package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter();

        BlackBox b2 = new BlackBox();
        BlackBox.callServiceCenter();

        //객체가 없어도 클래스를 통해 접근가능

    }
}
