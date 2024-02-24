package chap_13;

import java.io.*;
import java.util.Scanner;



public class _Quiz_13 {
    public static void main(String[] args) {
        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        System.out.println("------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("./src/chap_13/saying.txt"))) {
            while (true) {
                String question = br.readLine();
                if (question == null) {
                    break;
                }
                System.out.println("(문제) " + question);
                System.out.print(" 정답 입력 => ");
                String UserResult = sc.next();
                String result = br.readLine();
                if (UserResult.equals(result)) {
                    System.out.println("정답입니다!!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + result + "입니다.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("------------------------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.");
        System.out.println("수고하셨습니다. ^^");

    }
}
