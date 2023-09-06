import java.util.*;
public class MAP {
    public static void main(String args[])
    {
        HashMap hm=new HashMap();
        hm.put(1,"raja");
        hm.put(2,"mohan");
        hm.put(3,"rohan");
        System.out.println(hm);
        // Integer key=(Integer)hm.get(2);
        Object o=hm.get(2);
        // System.out.println(o);
        Set setkey=hm.keySet();
        Iterator itr=setkey.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // System.out.println(hm.get(3));


    }
    
}
