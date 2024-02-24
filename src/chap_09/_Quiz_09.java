package chap_09;

import java.util.ArrayList;

public class _Quiz_09 {
    public static void main(String[] args) {

        // classify c1 = new classify("유재석", "파이썬");
        // classify c2 = new classify("박명수", "자바");
        // classify c3 = new classify("김종국", "자바");
        // classify c4 = new classify("조세호", "C");
        // classify c5 = new classify("서장훈", "파이썬");

        ArrayList<classify> list = new ArrayList<>();
        list.add(new classify("유재석", "파이썬"));
        list.add(new classify("박명수", "자바"));
        list.add(new classify("김종국", "자바"));
        list.add(new classify("조세호", "C"));
        list.add(new classify("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("----------");

        for (classify lists : list) {
            if (lists.program.equals("자바")) {
                System.out.println(lists.name);
            }
        }

    }
}

class classify {
    public String name;
    public String program;

    public classify(String name, String program) {
        this.name = name;
        this.program = program;
    }
}
