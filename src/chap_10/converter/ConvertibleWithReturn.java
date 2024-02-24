package chap_10.converter;

@FunctionalInterface
public interface ConvertibleWithReturn {
    int convert(int USD, int KRW); //int로 반환 받기
}
