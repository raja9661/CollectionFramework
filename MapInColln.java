import java.util.*;
import java.util.Map.*;
public class MapInColln {
    public static void main(String args[])
    {
        Map<Integer,Integer> lm=new LinkedHashMap<>();
        lm.put(null, 10);
        lm.put(2, 20);
        lm.put(3,30);
        lm.put(4, 40);
        System.out.println(lm);
        Map<Integer,Character> hm=new HashMap<>();
        hm.put(1, 'm');
        hm.put(2, 'q');
        hm.put(3, 's');
        hm.put(4, 't');
         System.out.println(hm);

         // accessing using key values
        Set keySet=hm.keySet();
        Iterator itr=keySet.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        //accessing using value
        Collection values=hm.values();
        Iterator itr2=values.iterator();
        while(itr2.hasNext())
        {
            Character c =(Character)itr2.next();
            System.out.print(itr2.next()+" ");
        }
        // //both
        // System.out.println("");
        // Set entrySet=hm.entrySet();
        // Iterator itr3=entrySet.iterator();
        // while(itr3.hasNext())
        // {
        //     Map.Entry data=(Entry)itr3.next();
        //     System.out.println(data.getKey()+":"+data.getValue());
        // }
    }
}
