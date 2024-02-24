package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {

        // 두 코드는 같다
        KRWConverter converter2 = new KRWConverter();

        converter2.convert(3); //코드1
        convertUSD(converter2,3); //코드2

        //1. 똑같은 코드를 메소드 사용해 동작하게 하기 (인터페이스의 추상메소드를 따로 구현하지 않고, 전달값에서 바로 구현)
//      convertUSD(public void convert(int USD) {
//          System.out.println(USD + "달러 = " + (USD * 1400) + " 원");
//      },3);

        //2. 람다식으로 바꾸기
        // convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원"),3);

        //3. 간결하게 변수로 바꿔 대입
        Convertible convertible3 = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible3, 1);
        //인터페이스 타입 객체에 동작 정의와 동시에 대입이 된거고, 이걸 마치 변수처럼 전달해서 convertUSD 메소드를 호출하는 구조



        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원"); //구현체를 인터페이스 객체에 1:1대응시키기
        c1.convert(); //c1 객체를 인터페이스 구현 객체로 바로 사용 가능

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 두 개인 경우?
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + "달러 = " + (d * w) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우?
        //return이 있다면 중괄호 필수, 하지만 아예 return을 없애면 자동으로 결과를 반환
        ConvertibleWithReturn c3 = (d, w) -> d * w; //{return d*w};
        int result = c3.convert(20, 1400);
        System.out.println("20달러 = " + result + " 원");


    }

    //메소드같은 람다식을 호출하며 마치 변수처럼 사용 (인터페이스의 추상 메소드를 구현하는 람다식 코드를 인터페이스 객체와 1:1 매칭하여 대입)
    //따라서 함수형 인터페이스의 추상메소드는 단 한 개여야 함 -> 이게 함수형 인터페이스
    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    } //인터페이스 타입이지만 인터페이스의 객체는 못 만들기 때문에, 전달값에 인터페이스 타입으로 업캐스팅한 실제 구현객체가 들어가야 함.
}
