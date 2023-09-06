import java.util.*;

public class LinkedList_java {
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.add("raja");
        ll.add('r');
        ll.add(4);
        ll.add(56.3);
        ll.addFirst("first");
        ll.addLast("last");
        ll.add(3,5);
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll);
        List ll2=new LinkedList(); //if we declear type of linkedlist is list than we cannot use some specialized method like insert at firest and insert at last.
        ll2.add(90);
        ll2.add(ll);
        System.out.println(ll2); 
        Deque d=new LinkedList();//if we declear type of linkedlist is Deque then we cannot insert the element at specific index.
        d.add(55);
        d.add(ll2);
        System.out.println(d); 
        Queue q=new LinkedList();//if we declear type of linkedlist is queue then then element insert in first come first serve manner.
        q.add(5);
        q.add("raja");
        q.add(89.4);
        System.out.println(q); 
        
    }
}
