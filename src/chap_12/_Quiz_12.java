package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Goods goods1 = new Goods("A");
        Goods goods2 = new Goods("B");

        Thread thread1 = new Thread(goods1);
        Thread thread2 = new Thread(goods2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        pack();
    }
    public static void pack() {
        System.out.println("== 세트 상품 포장 시작 ==");
        for (int i = 1; i < 5; i++) {
            System.out.println("세트 상품 포장 " + i + "/5" );
        }
        System.out.println("== 세트 상품 포장 완료 ==");
    }
}

class Goods implements Runnable {
    String Goodsname;
    public Goods(String Goodsname) {
        this.Goodsname = Goodsname;
    }
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println(Goodsname + " 상품 준비 " + i + "/5" );
        }
        System.out.println(" -- " + Goodsname + " 상품 준비 완료 --");
    }
}
