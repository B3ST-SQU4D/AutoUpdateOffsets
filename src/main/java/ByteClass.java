public class ByteClass {
    private boolean isWildcard;
    private byte value;

    public ByteClass(byte value, boolean isWildcard) {
        this.value = value;
        this.isWildcard = isWildcard;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public void setWildcard(boolean isCard) {
        this.isWildcard = isCard;
    }

    public byte getValue() {
        return this.value;
    }

    public boolean isWildcard() {
        return this.isWildcard;
    }
}