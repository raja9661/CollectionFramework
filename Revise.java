import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.*;
public class Revise {
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add(2);
        al.add("car");
        al.add('r');
        al.add(3.4);
        al.get(1);
        // System.out.println(al.get(1));
        // System.out.println(al.size());
        // System.out.println(al.contains(2));
        // al.add(2,56);
        // System.out.println(al);
        // for(int i=0;i<al.size();i++)
        // {
        //     Object o=al.get(i);
        //     System.out.println(o);
        // }
        // ArrayList al2=new ArrayList();
        // al2.add(1);
        // al2.add(2);
        // al2.add(3);
        // System.out.println(al2);
        // al.addAll(al2);
        // System.out.println(al);
        // ArrayList al3=new ArrayList();
        // al3.add(1);
        // al3.add(2);
        // al3.add(3);
        // al3.addAll(al);
        // System.out.println(al3);
        // al3.clear();
        // System.out.println(al3);
        // Iterator itr=al.iterator();
        // ListIterator itr=al.listIterator(al.size());
        // while(itr.hasPrevious())
        // {
        //     // Integer i=(Integer)itr.next();
        //     System.out.println(itr.previous());
        // }
        CopyOnWriteArrayList li=new CopyOnWriteArrayList();
        li.add(2);
        li.add("car");
        li.add('r');
        li.add(3.4);
        System.out.println(li);
        Iterator itr=li.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            li.add(8);
        }
        // for(int i=0;i<li.size();i++)
        // {
        //     System.out.println(li.get(i));
        //     li.add(8);
        // }

    }
}
