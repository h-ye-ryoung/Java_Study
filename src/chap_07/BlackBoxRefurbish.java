package chap_07;

public class BlackBoxRefurbish {

    // 인스턴스 변수, 필드
    public String modelName; // 모델명
    String resolution; // 해상도
    private int price; // 가격
    protected String color; // 색상
    int serialNumber; // 시리얼 번호

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }
}
