class ConstantUtf8 extends ConstantInfo {
    private final String value;

    ConstantUtf8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}