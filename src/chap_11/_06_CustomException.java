package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        //사용자 정의 예외
        int age = 17;
        try {
            if (age < 19) {
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("조금 더 성장한 뒤에 오세요.");
        } catch (Exception e) {
            System.out.println("모든 예외를 처리합니다.");
        }

        //의도적으로 예외 만들기 (throw 던져서 - catch 받기)
    }
}

//사용자 정의 예외 클래스
class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}

//새로운 예외 클래스는 Exception클래스를 상속해야함
//NullPointerException 같은 하위 Exception 상속도 가능

//생성자 만들기: Alt+Insert로 Constructor 클릭
//오류 메시지를 전달받고,부모 클래스의 생성자 호출