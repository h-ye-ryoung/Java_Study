package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {

        // 특수문자, 이스케이프 시퀀스
        // \n \t \\ \" \'

        System.out.println("자바가\n너무\n재밌어요");
        System.out.println("해물파전\t\t9000원");
        System.out.println("C:\\Program Files\\Java");
        System.out.println("단비가 \"냐옹\" 이라고 했어요.");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요.");
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요."); //문자열에서는 '가 영향을 끼치지 않음

        char c = 'A';
        char d = '\''; //작은따옴표를 한 character로 취급하고 싶을 경우
        System.out.println(d);

    }
}
