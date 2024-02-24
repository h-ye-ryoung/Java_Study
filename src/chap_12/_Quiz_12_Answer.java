package chap_12;

public class _Quiz_12_Answer {
    public static void main(String[] args) {

        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println(" -- A 상품 준비 완료 --");
        };

        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println(" -- B 상품 준비 완료 --");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

//        while (threadA.isAlive() || threadB.isAlive()) {
//
//        }
//        쓰레드가 살아있으면 (동작 중이면) True, 아니면 False
//        while문을 통해 만약 둘 중 하나라도 살아있으면 아무것도 하지 않고 반복해서 대기하는 코드.

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = () -> {
            System.out.println( "== 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println("== 세트 상품 포장 완료 ==");
        };

        Thread threadSet = new Thread(runnableSet);
        threadSet.start();

    }
}




