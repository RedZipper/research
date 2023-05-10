class ConstantDouble extends ConstantInfo {
    private final double value;

    ConstantDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
