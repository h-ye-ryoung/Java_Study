package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("--------");

        // Try with Resources
        // try에 소괄호 넣고, 소괄호 안에서 객체 생성

        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //close 메소드를 호출하지 않았음에도 자동으로 close()가 호출됨
        //괄호 속에서 리소스/객체를 정의하게 되면 자동으로 try-catch 구문을 빠져 나올 때 호출
        //이 객체는 AutoCloseable이라는 인터페이스를 구현해야 함 (close()라는 추상메소드 구현)

        //파일을 쓰기 위해 자주 사용되는 클래스
        //이것도 위처럼 try 구문의 리소스로 쓸 수 있음
        //타고타고 올라가다 보면 AutoCloseable 클래스를 implement 하고 있기 때문
        BufferedWriter bw = null;

    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용: " + line);
    }
}