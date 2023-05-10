class ConstantFloat extends ConstantInfo {
    private final float value;

    ConstantFloat(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}