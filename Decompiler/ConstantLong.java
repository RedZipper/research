class ConstantLong extends ConstantInfo {
    private final long value;

    ConstantLong(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}