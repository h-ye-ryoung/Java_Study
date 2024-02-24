package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림 생성

        //배열 사용 (Arrays.steam)
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langstream = Arrays.stream(langs);

        //컬렉션 프레임워크 사용 (Collection.stream())
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        // langList.add("java"); ...
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        Stream<String> langListstream = langList.stream();

        //Stream.of() 사용
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        //스트림 사용
        //중간 연산 (Intermediate Operation) -> 여러 개의 필터 (개수제한 x)
            // filter, map, sorted, distinct, skip, ...
        //최종 연산 (Terminal Operation) -> 최종 결과물 (1번)
            // count, min, max, sum, forEach, anyMatch, allMatch, ...

        //90점 이상인 점수만 출력
        //객체에 넣지 않는 이유는, 그때그때 스트림을 생성해서 매번 초기 스트림 상태로 두기 위함
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));

        //클래스명::메소드명을 ::로 구분해서 적으면 앞에서 넘어온 데이터가 자동으로 들어옴
        //같은 결과
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

        System.out.println("------");

        //90점 이상인 사람의 수
        //.count() 함수 반환형이 long으로 되어있음
        int count = (int)Arrays.stream(scores).filter(x -> x >=90).count();
        System.out.println(count);

        System.out.println("------");

        //90점 이상인 사람의 점수의 합
        //.sum() 함수 반환형이 int로 되어있음
        int sum = Arrays.stream(scores).filter(x -> x >=90).sum();
        System.out.println(sum);

        System.out.println("------");

        //"python", "java", "javascript", "c", "c++", "c#"
        //c로 시작하는 프로그래밍 언어 추출
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);

        System.out.println("------");

        //java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);

        System.out.println("------");

        //글자수가 4개 이하인 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);

        System.out.println("------");

        //글자수 4개 이하인 언어 중에 c라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <=4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);

        System.out.println("------");

        //글자수 4개 이하인 언어 중에 c라는 글자를 포함하는 언어가 있는지 여부
        //anyMatch : 뭐가 됐든지 매칭되는 게 하나라도 있으면 true
        //allMatch : 모든 항목이 일치하면 true
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        //여러 개의 true/false 중에 하나만 true이면 true 반환
        System.out.println(anyMatch);

        //4개 이하인 언어는 모두 c라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("c"));
        //모두 true가 아니므로 false 반환
        System.out.println(allMatch);

        System.out.println("-------");


        //map : 데이터를 원하는 형태로 가공/객체 중에서 꺼내고 싶은 인스턴스 변수 지정 하는 역할
        //데이터 변환 및 특정 속성의 추출

        //c 시리즈 언어에 (어려워요) 붙이기
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);

        System.out.println("-------");

        //c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase) //앞에서 자동으로 데이터들이 넘어옴
                .forEach(System.out::println);

        System.out.println("-------");

        //c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        //출력만 하고 끝내지 않고 결과물들을 새로운 리스트로 반환
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartsWithC.stream().forEach(System.out::println);

        System.out.println("-------");




    }
}
