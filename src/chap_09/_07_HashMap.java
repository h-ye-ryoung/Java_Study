package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //데이터 추가
        map.put("유재석", 10); //Key와 Value
        map.put("박명수", 5);
        map.put("김종국", 3);

        System.out.println("총 고객 수: " + map.size()); //3
        System.out.println("----------");

        //데이터 조회
        System.out.println("유재석님의 포인트: " + map.get("유재석")); //key값으로 value 가져오기
        System.out.println("박명수님의 포인트: " + map.get("박명수"));

        //데이터 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트: " + map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록(포인트 1)");
        }

        //데이터 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석")); //null

        //전체 삭제
        map.clear();
        map.isEmpty(); //true

        //고객 복귀
        map.put("유재석", 10); //Key와 Value
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("----------");

        //key 확인
        for(String key : map.keySet()) { //key들만 모아 놓은 배열
            System.out.println(key);
        } //순서가 보장되지 않는다

        System.out.println("----------");

        //value 확인
        for(int value : map.values()) { //value들만 모아 놓은 배열
            System.out.println(value);
        } //순서가 보장되지 않는다

        System.out.println("----------");

        //key와 value 한번에 확인
        for(String key : map.keySet()) { //key들만 모아 놓은 배열
            System.out.println("고객 이름: " + key + "\t포인트: " + map.get(key));
        } //쌍 맞추기, 쌍의 순서는 보장되지 않는다

        //맵: 중복을 허용하지 않는다
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);

        System.out.println(map.get("김종국")); //50
        //동일한 key값은 단 하나여야 함, 제일 최종적으로 value에 넣은 값이 적용됨 (업데이트)

        //순서를 보장하고 싶은 경우
        HashMap<String,Integer> map2 = new LinkedHashMap<>();
        //key값 기준으로 순서를 보장

    }
}
