abstract class ConstantInfo {
}

class ConstantUtf8 extends ConstantInfo {
    private final String value;

    ConstantUtf8(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class ConstantInteger extends ConstantInfo {
    private final int value;

    ConstantInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class ConstantFloat extends ConstantInfo {
    private final float value;

    ConstantFloat(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}

class ConstantLong extends ConstantInfo {
    private final long value;

    ConstantLong(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}

class ConstantDouble extends ConstantInfo {
    private final double value;

    ConstantDouble(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

class ConstantClass extends ConstantInfo {
    private final int nameIndex;

    ConstantClass(int nameIndex) {
        this.nameIndex = nameIndex;
    }

    public int getNameIndex() {
        return nameIndex;
    }
}

class ConstantString extends ConstantInfo {
    private final int stringIndex;

    ConstantString(int stringIndex) {
        this.stringIndex = stringIndex;
    }

    public int getStringIndex() {
        return stringIndex;
    }
}

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

class ConstantNameAndType extends ConstantInfo {
    private final int nameIndex;
    private final int descriptorIndex;

    ConstantNameAndType(int nameIndex, int descriptorIndex) {
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
    }

    public int getNameIndex() {
        return nameIndex;
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }
}

class ConstantMethodHandle extends ConstantInfo {
    private final int referenceKind;
    private final int referenceIndex;

    ConstantMethodHandle(int referenceKind, int referenceIndex) {
        this.referenceKind = referenceKind;
        this.referenceIndex = referenceIndex;
    }

    public int getReferenceKind() {
        return referenceKind;
    }

    public int getReferenceIndex() {
        return referenceIndex;
    }
}

class ConstantMethodType extends ConstantInfo {
    private final int descriptorIndex;

    ConstantMethodType(int descriptorIndex) {
        this.descriptorIndex = descriptorIndex;
    }

    public int getDescriptorIndex() {
        return descriptorIndex;
    }
}

class ConstantInvokeDynamic extends ConstantInfo {
    private final int bootstrapMethodAttrIndex;
    private final int nameAndTypeIndex;

    ConstantInvokeDynamic(int bootstrapMethodAttrIndex, int nameAndTypeIndex) {
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    public int getBootstrapMethodAttrIndex() {
        return bootstrapMethodAttrIndex;
    }

    public int getNameAndTypeIndex() {
        return nameAnd
