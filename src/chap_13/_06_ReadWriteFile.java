package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때

        //파일 쓰기
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
//            bw.write("1. 이제 거의 끝이 보여요."); //파일 쓰기 (자동으로 줄바꿈해주지X)
//            bw.newLine(); //줄바꿈해주는 함수
//            bw.write("3. 조금만 더 힘내요!");
//            bw.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //FileWriter 객체는 예외처리를 해줘야 함 (try-catch)
        //BufferedWriter 객체의 생성자로 FileWriter 객체 사용

        //파일을 열었다고 하면, 파일을 닫는 작업이 필요
        //필수불가결하므로 finally 사용.
        //->자동으로 close하기 위해 try-with-resources 사용해야 함 -> try( 객체 생성 )
        //try 구문이 끝날 때 자동으로 bw.close() 메소드를 호출하게 됨

        //파일 읽기
        try(BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }


    }
}
