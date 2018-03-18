package Task18;

public class DoubleLinkedList {

    Node head;
    private int size = 0;

   public void insertAfter (String value){

       if (head==null){
           head = new Node(value);
           size++;
           return;
       }

       Node current = head;

       while (current!=null){
           if (current.next == null){
               current.next = new Node(value);
               current.next.previous = current;
               size++;
               return;
           }
           current = current.next;
       }


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
       Node current = head;
       while (current!=null){
           if (current.getValue().equals(value)){
               return true;
           }
           current = current.next;
       }
       return false;
   }

   public void remove (String value){
       Node current = head;
       while (current!=null){
           if (current.getValue().equals(value)){
               if(current.previous==null){
                   head = head.next;
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
       while (head.next!=null){
           head = head.next;
       }
       head = null;
       size = 0;
   }

}
