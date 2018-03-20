package Task18;

public class DoubleLinkedList {

    Node head;
    Node tail;
    private int size = 0;

   public void insertAfter (String value){

       if (head==null){
           head = new Node(value);
           size++;
           return;
       }

       if (head.next!=null){
           tail = new Node(value);
           head.next = tail;
           tail.previous = head;
           size++;
           return;
       }
       Node current = tail;
       tail.next = new Node(value);
       tail = tail.next;
       tail.previous = current;

   }

   public void insertBefore (String value){
       if (head==null){
           head = new Node(value);
           size++;
           return;
       }

       head.previous = new Node(value);

       Node current = head;
       head = head.previous;
       head.next = current;
       size++;

   }

   public boolean contains (String value){
       Node currentStart = head;
       Node currentEnd = tail;
       while (!currentStart.previous.equals(currentEnd.next)){
           if (currentStart.getValue().equals(value) || currentEnd.getValue().equals(value)){
               return true;
           }
           currentStart = currentStart.next;
           currentEnd = currentEnd.previous;
       }
       return false;
   }

   public void remove (String value){
       Node current = head;
       while (current!=null){
           if (current.getValue().equals(value)){
               if(current.previous==null){
                   head = head.next;
                   size--;
                   return;
               }
               head = head.previous;
               current.next.previous = head;
               size = 0;
               return;
           }
       }
          }

   public Node find (String value){
       Node current = head;
       while (current!=null){
           if (current.getValue().equals(value)){
               return current;
           }
       }
       return null;
   }

   public void clear (){
       head = null;
       tail = null;
   }

}
