package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
        public static void main(String[] args) {
                // 제네릭 클래스

                CoffeeByNumber c1 = new CoffeeByNumber(33);
                c1.ready();

                CoffeeByNickname c2 = new CoffeeByNickname("유재석");
                c2.ready();

                System.out.println("----------");

                // Object 사용
                CoffeeByName c3 = new CoffeeByName(34);
                c3.ready();
                CoffeeByName c4 = new CoffeeByName("박명수");
                c4.ready();

                System.out.println("----------");

                // 고객 name 가져오기
                // int c3Name = c3.name; -> int형 변수에 Object를 넣어서 오류

                int c3Name = (int) c3.name; //형변환을 통해 집어넣어야 함: 다운캐스팅은 수동 형변환 필요
                System.out.println("주문 고객 번호: " + c3.name);
                String c4Name = (String) c4.name;
                System.out.println("주문 고객 이름: " + c4.name);

                //실수로 값을 잘못 가져왔다면?
                //c4Name = (String) c3.name; -> 컴파일 과정에서 오류

                System.out.println("----------");

                Coffee<Integer> c5 = new Coffee<>(35);
                c5.ready();
                int c5Name = c5.name;
                System.out.println("주문 고객 번호: " + c5Name);

                Coffee<String> c6 = new Coffee<>("조세호");
                c6.ready();
                String c6Name = c6.name;
                System.out.println("주문 고객 이름: " + c6Name);

                System.out.println("----------");

                CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
                c7.ready();

                CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
                c8.ready();

                CoffeeByUser<VIPUser> c9 = new CoffeeByUser<>(new VIPUser("이수근"));
                // CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox()); -> 오류

                System.out.println("----------");

                orderCoffee("김영철");
                orderCoffee(36);

                orderCoffee("김희철", "아메리카노");
                orderCoffee(36,"라떼");

        }
        public static <T> void orderCoffee(T name) {
                System.out.println("커피 준비 완료 : " + name);
        }

        public static <T,V> void orderCoffee(T name, V coffee) {
                System.out.println(coffee + " 준비 완료 : " + name);
        }
}
