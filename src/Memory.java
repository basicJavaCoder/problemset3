public class Memory extends Computer {

    private String type;
    private int size;

    @Override

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return "Memory{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
}