package chap_09;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        HashSet<String> set = new HashSet<>();

        // 데이터 추가
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        // 순회
        for (String s:set) {
            System.out.println(s);
        }

        System.out.println("----------");

        // 데이터 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("----------");

        // 삭제
        set.remove("삼겹살");
        // set.remove(1); //인덱스를 사용한 메소드 사용 불가
        System.out.println("총 구매 상품 수 : " + set.size());

        // 전체 삭제
        set.clear();
        set.isEmpty(); //true

        // 세트: 중복도 허용하지 않고, 순서도 보장하지 않음
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        intSet.add(13);

        for (int i : intSet) {
            System.out.println(i);
        }

        // 순서는 보장
        HashSet<Integer> intSet2 = new LinkedHashSet<>();
        intSet2.add(1);
        intSet2.add(13);
        intSet2.add(2);
        intSet2.add(13);

        for (int i : intSet2) {
            System.out.println(i);
        }


    }
}
