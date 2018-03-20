package Task18;

public class Node {

    private String value;
    Node previous;
    Node next;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){return false;}
        if (!(obj instanceof Node)){return false;}
        obj = (Node) obj;
        return this.getValue().equals(((Node) obj).getValue())? true:false;
    }
}


