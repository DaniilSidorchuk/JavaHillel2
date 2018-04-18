package Task28;

public class Message <T> {

    T object;

    public Message() {
    }

    public Message(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
