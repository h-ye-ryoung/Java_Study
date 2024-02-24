package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {

        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수(int): " + random.nextInt()); //int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위): " + random.nextInt(10)); // 0 이상 10 미만의 정수형 값 반환, int만 가능
        System.out.println("랜덤 정수 (long): " + random.nextLong());
        System.out.println("랜덤 실수 (double): " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수형 값 반환
        System.out.println("랜덤 실수 (float):" + random.nextFloat());

        System.out.println("랜덤 boolean: " + random.nextBoolean());

        // 만약 5.0 이상 12.0 미만의 실수를 뽑으려면?
        // System.out.println("랜덤 실수(범위): " + random.nextDouble(10.0)); 범위 지정 불가
        double min = 5.0;
        double max = 12.0;
        System.out.println("랜덤 실수 (범위): " + ((max-min) * random.nextDouble() + min) ); // 0.0이상 7.0이하 실수값 + 5.0

        // 로또 범위를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호: " + (random.nextInt(45) + 1)); //1 이상 46 미만의 정수

        // 다른 외부 클래스
        // Math(수식), Scanner(입력), StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal(오차 없는 실수계산)
        // 날짜 관련: LocalDate, LocalTime, LocalDateTime, DateTimeFormatter ...

    }
}
