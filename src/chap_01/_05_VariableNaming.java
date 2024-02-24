package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {

        //  입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "혜령"; //이름
        String lastName = "김"; //성
        String dateOfBirth = "2002-08-29"; //생년월일
        String residentialAddress = "무슨 호텔"; //체류지
        String purposeOfVisit = "관광"; //입국 목적
        String flightNo = "KE657"; //항공 편명
        String _flightNo = "KE657"; //밑줄 시작
        String flight_no_2 = "KE657"; //밑줄과 숫자 포함
        // String -flightNo = "KE657"; <-오류

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "전자제품"; <-오류

        //  절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
        // CODE = "US"; <-오류


    }
}
