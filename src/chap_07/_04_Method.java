package chap_07;

public class _04_Method {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        // 일반 영상 : 타입 1
        // 이벤트 영상 (충돌 감지 영상) : 타입 2

        int fileCount1 = b1.getVideoFileCount(1); // 일반 영상 갯수
        int fileCount2 = b1.getVideoFileCount(2); // 이벤트 영상 갯수

        System.out.println("일반 영상 갯수: " + fileCount1);
        System.out.println("이벤트 영상 갯수: " + fileCount2);

    }
}
