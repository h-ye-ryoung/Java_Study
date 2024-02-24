package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String number = "020829-4000000";
        System.out.println(number.substring(0,8));
        System.out.println(number.substring(0,number.indexOf("-")+2));
    }
}
