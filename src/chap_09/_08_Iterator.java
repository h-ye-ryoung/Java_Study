package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        //이터레이터

        List<String> list = new ArrayList<>(); //List는 인터페이스, ArrayList는 List를 구현한 클래스
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------");

        Iterator<String> it = list.iterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("----------");

        it = list.iterator(); //커서를 처음 위치로 이동

        //리스트의 모든 데이터 순회
        while (it.hasNext()) { //다음에 가져올 데이터가 있으면 true, 없으면 false
            System.out.println(it.next());
        }

        System.out.println("----------");

        //삭제
        it = list.iterator(); //커서를 처음 위치로 이동
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); //바로 삭제: 삭제하려는 데이터를 빠르게 지울 수 있음
            }
        }

        //삭제 확인
        it = list.iterator(); //커서를 처음 위치로 이동
        //리스트의 모든 데이터 순회
        while (it.hasNext()) { //다음에 가져올 데이터가 있으면 true, 없으면 false
            System.out.println(it.next());
        }

        System.out.println("----------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();

        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        } //순서를 보장하지 않기 때문에, 순서를 무시하고 순회

        System.out.println("----------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() -> 제공되지 않음

        Iterator<String> itMapKey = map.keySet().iterator();

        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        } //순서를 보장하지 않기 때문에, 순서를 무시하고 순회

        Iterator<Integer> itMapValue = map.values().iterator();

        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        } //순서를 보장하지 않기 때문에, 순서를 무시하고 순회

        System.out.println("----------");

        //key와 value 함께 출력
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        //자동완성: option command v

        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        } //마찬가지로 순서는 무시, 하지만 key와 value 쌍이 =를 통해 엮여 있음 (유재석=10)


    }
}
