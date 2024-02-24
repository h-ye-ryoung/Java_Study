package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        // HomeMadeBurger momMadeBurger = new HomeMadeBurger() { };
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        //momMadeBurger 객체 -> HomeMadeBurger 라는 추상 클래스를 상속한 한 익명 클래스를 갖게 됨
        momMadeBurger.cook();

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료: 빵, 소고기패티, 해쉬브라운, 양상추, 마요네즈, 피클");
            }
        }; //HomeMadeBurger 라는 추상 클래스를 상속해 cook 이라는 메소드를 정의하는 익명클래스 코드
    }

    public static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료: 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }
}

abstract class HomeMadeBurger { //집집마다 달라지기 때문에 따로 클래스를 정의하는 것은 무리
    public abstract void cook();
}
//추상클래스를 상속한 구현 클래스를 따로 만들지 않고, 익명 클래스로 처리