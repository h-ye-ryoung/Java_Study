package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();

        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("-----");
        // 윈도우 : C:\\Users\\Nadocoding\\Desktop (\는 이스케이프 시퀀스라서 두개)
        // 맥 : /Users/Nadocoding/Desktop
        // 정확히 : "A" + File.separator + "B" + File.separator + "C"

        folderName = "A/B/C";
        folder = new File(folderName);

        //folder.mkdir(); -> 단일폴더 생성
        folder.mkdirs();

        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdirs)");
        }


    }
}
