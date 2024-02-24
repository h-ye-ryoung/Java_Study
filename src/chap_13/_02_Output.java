package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.println();

        // System.out.format();
        // System.out.printf(); 둘은 같다.(print format)

        System.out.println("------ 정수 ------");
        System.out.printf("%d%n", 1);

        System.out.printf("%d %d %d%n", 1, 2, 3);

        System.out.printf("%d%n", 1234);  //1234
        System.out.printf("%6d%n", 1234);  //__1234
        System.out.printf("%06d%n", 1234); //001234

        System.out.printf("%6d%n", -1234); //_-1234
        System.out.printf("%+6d%n", 1234); //_+1234
        System.out.printf("%+06d%n", 1234); //+01234

        System.out.printf("%,15d%n", 1000000000); //__1,000,000,000
        System.out.printf("%+,015d%n", 1000000000);

        System.out.printf("%-6d%n", 1234); //1234__

        System.out.println("------ 실수 ------");
        System.out.printf("%f%n", Math.PI); //3.141593

        System.out.printf("%.2f%n", Math.PI); //3.14
        System.out.printf("%6.2f%n", Math.PI); //__3.14

        System.out.printf("%-6.2f%n", Math.PI); //3.14__
        System.out.printf("%06.2f%n", Math.PI); //003.14

        System.out.printf("%+f%n", Math.PI);
        System.out.printf("%+6.2f%n", Math.PI); //_+3.14

        System.out.println("------ 문자열 ------");

        System.out.printf("%s%n", "Java"); //Java (일반 출력)
        System.out.printf("%6s%n", "Java"); //__Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); //Java__ (6자리 공간 확보하고 좌측 정렬)

        System.out.printf("%.2s%n", "Java"); //Ja (2글자만 출력)
        System.out.printf("%6.2s%n", "Java"); //____Ja (6자리 공간 확보하고 우측 정렬해서 2글자만 출력)
        System.out.printf("%-6.2s%n", "Java"); //Ja____

        System.out.println("------ 응용1 ------");
        System.out.println("이름 영어 수학 평균점수");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5);

        System.out.println("------ 응용2 ------");
        System.out.println("이름      영어   수학   평균"); //공백 각각 6,3,3
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 95, 100, 97.5);

        System.out.println("------ 참고 ------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
        //같은 7자리의 자리수를 가지지만, 영어인지/한글인지/숫자인지/공백이 섞였는지 여부에 따라
        //보여지는 길이가 모두 다름 -> 숫자/영어/한글/공백이 섞이면 깔끔하지 않은 출력이 될 수 있음
        //각각 필요로 하는 자릿수 공간이 다름.
        //만약 6글자로 할당한 문자열에 세자리, 두자리 문자를 각각 입력하면 두자리 문자는 문자-1, 공백+1인 셈인데,
        //공백이 상대적으로 공간을 덜 차지하기 때문에, 뒤의 데이터가 조금 더 당겨짐
    }
}
