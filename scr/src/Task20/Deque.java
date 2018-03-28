package Task20;



public class Deque {

    private String value;
    private Node previous;
    private Node next;
    private Node first;
    private Node last;
    private int size = 0;

    boolean addFirst(String element){
        if (first == null){
            first = new Node(element);
            last = first;
            size++;
            return true;
        }
        Node current = first;
        first.previous = new Node(element);
        first = first.previous;
        first.next = current;
        size++;
        return true;
    }

	boolean addLast(String element){
        if (last==null){
            last = new Node(element);
            first = last;
            size++;
            return true;
        }
        Node current = last;
        last.next = new Node(element);
        last = last.next;
        last.previous = current;
        size++;
        return true;
    }

	boolean removeFirst(){
        if (first==null){
            return false;
        }
        first = first.next;
        size--;
        return true;
    }

	boolean removeLast(){
        if (last==null){
            return false;
        }
        last = last.previous;
        size--;
        return true;
    }

	String peekFirst() {
        return first!=null? first.getValue(): null;
    }

	String peekLast(){
        return last!=null? last.getValue() : null;
    }

	String pop(){
        String str = peekLast();
        this.removeLast();
        return str;
    }

	String poll(){
        String str = peekFirst();
        this.removeFirst();
        return str;
    }

	boolean contains(String element){
        Node currentStart = first;
        Node currentEnd = last;
        while (currentStart.next!=null && currentEnd.next!=null){
            if (currentStart.getValue().equals(element) || currentEnd.getValue().equals(element)){
                return true;
            }
            currentStart = currentStart.next;
            currentEnd = currentEnd.previous;
        }
        return false;
    }

	int size(){
        return size;
    }

    private class Node{
        private String value;
        public Node previous;
        public Node next;

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


    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFirst("AAA");
        deque.addFirst("SSS");
        deque.addLast("lll");
        deque.addLast("dddd");

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.size);

        System.out.println(deque.poll());
        System.out.println(deque.pop());

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.contains("lll"));
        System.out.println(deque.contains("ll"));

    }

}
