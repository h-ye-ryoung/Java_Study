package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회
        System.out.println(list.get(0)); //인덱스 0의 데이터 조회
        System.out.println(list.getFirst()); //리스트의 첫 번째 원소 반환
        System.out.println(list.getLast()); //리스트의 마지막 원소(마지막으로 추가된 데이터) 반환

        System.out.println("----------");

        //데이터 추가
        list.add("뱀뱀"); //항상 마지막 데이터 다음 위치에 추가
        list.addFirst("서장훈"); //해당 데이터를 제일 첫 번째 원소로 추가
        list.addLast("김희철"); //해당 데이터를 제일 마지막 원소로 추가

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------");

        //중간에 원하는 위치에 데이터 추가 (ArrayList, LinkedList 모두 사용가능)
        list.add(1,"김영철"); //인덱스 1의 위치에 해당 데이터 추가, 원래 인덱스 1의 데이터는 인덱스 2가 됨
        list.get(1); //"김영철"

        System.out.println("----------");

        //데이터 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        //처음 학생과 마지막 학생이 전학
        list.removeFirst(); //처음 데이터를 삭제
        list.removeLast(); //마지막 데이터를 삭제
        System.out.println("남은 학생 수 (전학 후) : " + list.size());

        System.out.println("----------");

        //데이터 변경(수강권 양도)
        list.set(0,"이수근");
        System.out.println(list.get(0));

        //데이터 확인
        System.out.println(list.indexOf("김종국"));
        System.out.println(list.contains("김종국")); //true

        //데이터 전체 삭제
        list.clear();
        list.isEmpty(); //true

        //새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 정렬
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

    }
}
