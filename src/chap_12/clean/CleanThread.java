package chap_12.clean;

public class CleanThread extends Thread {
    //run 메소드 정의
    public void run() {
        System.out.println("-- 직원 청소 시작 (Thread) --");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Thread)");
        }
        System.out.println("-- 직원 청소 끝 --");
    }
}
