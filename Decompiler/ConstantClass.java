class ConstantClass extends ConstantInfo {
    private final int nameIndex;

    ConstantClass(int nameIndex) {
        this.nameIndex = nameIndex;
    }

    public int getNameIndex() {
        return nameIndex;
    }
}