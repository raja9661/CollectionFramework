import java.util.*;
public class ArrayDeque_java {
    public static void main(String args[])
    {
        ArrayDeque ad=new ArrayDeque();
        ad.add(23);
        ad.add("you");
        ad.add(90);
        ad.add(116);
        ad.add(116);
        System.out.println(ad);
        ad.addFirst("first");
        ad.addLast("last");
        System.out.println(ad);
        System.out.println(ad.contains(116));
    }
}
