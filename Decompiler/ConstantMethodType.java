class ConstantMethodType extends ConstantInfo {
    private final int descriptorIndex;

    ConstantMethodType(int descriptorIndex) {
        this.descriptorIndex = descriptorIndex;
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }
}
