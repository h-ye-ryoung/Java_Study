package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        int[] shoeSize = new int[10];
        for (int i = 0; i < shoeSize.length; i++) {
            shoeSize[i] = 250 + (5*i);
            System.out.println("사이즈 " + shoeSize[i] + "(재고 있음)");
        }

    }
}
