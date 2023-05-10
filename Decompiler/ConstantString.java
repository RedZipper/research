class ConstantString extends ConstantInfo {
    private final int stringIndex;

    ConstantString(int stringIndex) {
        this.stringIndex = stringIndex;
    }

    public int getStringIndex() {
        return stringIndex;
    }
}