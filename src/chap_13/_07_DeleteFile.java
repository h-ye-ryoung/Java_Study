package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {

        //파일 삭제
        File file = new File("goodjob.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        //파일이 다른 프로그램에 의해 잡혀 있으면 삭제되지 않을 수 있으니
        //삭제되었는지 확인하기 위해서는 if로 감싸주기
        //file.delete() 함수의 리턴 타입은 boolean
        //파일이 잘 삭제되었으면 True, 아니면 False
        //이미 삭제되었으면 이제 그 경로가 없으므로 false가 뜰것임.

        //파일이 있을 때만 파일을 삭제하도록 시도 -> if (file.exists())

        //폴더 삭제
        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }
        //어떤 폴더 밑에 하위 폴더나 파일이 있으면 삭제하지 못함
        //하위 폴더부터 순차적으로 지워나가야 함
        //ex) new File("A/B/C") 를 delete하면 C라는 폴더가 지워짐(C가 제일 하위 폴더)

        //하지만 하나씩 매번 지우는 것은 힘듦
        //어떤 폴더를 선택했을 때 그 폴더 내에 있는 모든 하위파일/폴더들을 함께 삭제하는 코드?

        if (deleteFolder(folder)) {
            System.out.println("* 폴더 삭제 성공 : " + folder.getAbsolutePath());
        } else {
            System.out.println("* 폴더 삭제 실패 : " + folder.getAbsolutePath());
        }

    }

    public static boolean deleteFolder(File folder) { //삭제하려는 폴더를 인자로 받음
        if (folder.isDirectory()) { //정말 폴더라면,
            for (File file : folder.listFiles()) { //하위 폴더와 파일들 목록을 얻어옴
                deleteFolder(file); //재귀호출
            }
        } //재귀호출을 계속 돌리며 최하위 폴더와 그 안의 최하위 파일들까지 리스트업 완료.
        //불러와진 폴더, 또는 파일 삭제하는 부분
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
    //재귀 호출로 바깥 폴더부터 안쪽 폴더까지 순서대로 폴더.파일을 호출해서(선택해서),
    //해결은 안쪽 폴더부터 .delete()가 작동되어 삭제되게 하는 방식

    //+가장 깊숙히 있던 폴더부터 하나씩 탈출하면서 삭제됨

    // deleteFolder(A)
    //      deleteFolder(B)
    //            deleteFolder(C)
    //            C.delete() 삭제
    //      B.delete() 삭제
    // A.delete() 삭제
}
