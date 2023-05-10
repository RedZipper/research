class ConstantInteger extends ConstantInfo {
    private final int value;

    ConstantInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}