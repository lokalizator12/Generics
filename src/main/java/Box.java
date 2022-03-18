public class Box <T,K,M>{
    private T type;
    private K type2;
    private M type3;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public K getType2() {
        return type2;
    }

    public void setType2(K type2) {
        this.type2 = type2;
    }

    public M getType3() {
        return type3;
    }

    public void setType3(M type3) {
        this.type3 = type3;
    }

    public Box(T type, K type2, M type3) {
        this.type = type;
        this.type2 = type2;
        this.type3 = type3;
    }
}
