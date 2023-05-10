class ConstantRef extends ConstantInfo {
    private final int tag;
    private final int classIndex;
    private final int nameAndTypeIndex;

    ConstantRef(int tag, int classIndex, int nameAndTypeIndex) {
        this.tag = tag;
        this.classIndex = classIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getTag() {
        return tag;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }
}