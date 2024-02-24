package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        ArrayList<String> list = new ArrayList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회 (인덱스 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(3));

        System.out.println("----------");

        //데이터 삭제 (박명수 이사)
        System.out.println("신청 학생 수(이사 전) : " + list.size()); //5
        list.remove("박명수");
        System.out.println("신청 학생 수(이사 후) : " + list.size()); //4

        System.out.println("----------");

        System.out.println("남은 학생 수(제외 전) : " + list.size()); //4
        list.remove(list.size() - 1); //리스트의 마지막 원소 삭제
        list.remove(0); //0번째 인덱스의 원소 삭제
        System.out.println("남은 학생 수(제외 후) : " + list.size()); //2

        System.out.println("----------");

        //데이터 순회
        for (String s : list) {
            System.out.println(s);
        }

        //데이터 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0)); //유재석
        list.set(0,"이수근");
        System.out.println("수강권 양도 후 : " + list.get(0)); //이수근

        System.out.println("----------");

        //데이터 확인
        System.out.println(list.indexOf("김종국")); //몇 번째 인덱스인지

        //데이터 확인 - 선착순 내에 포함되었는가? (true/false)
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("----------");

        //전체 삭제
        list.clear();

        //전체 삭제 - 리스트가 비어있는가? (true/false)
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("----------");

        //다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //정렬
        Collections.sort(list); //.sort(정렬할 데이터 리스트)

        for (String s : list) {
            System.out.println(s);
        }
        //가나다 순으로 정렬


    }
}
