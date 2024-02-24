package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int ErrorCode = 2;
        try {
            if (ErrorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");

            } else if (ErrorCode == 1) {
                throw new NoTimeException("상품 구매 가능 시간이 아닙니다.");

            } else if (ErrorCode == 2) {
                throw new NoGoodsException("해당 상품은 매진되었습니다.");
            }

        } catch (NoTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");

        } catch (NoGoodsException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");

        }
    }
}

class NoTimeException extends Exception {
    public NoTimeException (String message) {
        super(message);
    }
}

class NoGoodsException extends Exception {
    public NoGoodsException(String message) {
        super(message);
    }
}
