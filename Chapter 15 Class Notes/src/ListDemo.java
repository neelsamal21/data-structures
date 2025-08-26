import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<>();
        /*The addLast method can be used to popualte a list */
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Steve");
        System.out.println(staff);
        //the list is currently TNPS
        /*
         * The listiterator method creates a new list iterator
         * That is positioned at the head of the list.
         * The | is used to represent the iterator postion 
         */

         ListIterator<String> iterator = staff.listIterator(); // TNPS
         /* The next method advances the iterator over the next element in the list */
         iterator.next(); // T|NPS
         /* The next method also return the element that the iterator passes over */
        String avenger = iterator.next(); //TN|PS
        System.out.println(avenger); // should print Natasha);
         
        /* the add emthod isnerts an elment at the iteraotr posion 
         * the iterator is than psotuoaned AFTER the elment that was added
         */
        iterator.add("Clint");//TNC|PS
        iterator.add("Bruce"); // TNCB|PS
        System.out.println(staff); 
        /* the remove method can only be called after calling next or previous */
        //iterator.remove(); this line would result in an IllegalStateException
        // the remove method revmoes the element  returned after calling to next or previous
        iterator.next();  //TNCBP|S
        iterator.remove(); // Peter is remvoed -> TNCB|S
        System.out.println(staff);
        /* The set element method update the element returned by
         * the last call to next or previous
         */
        iterator.previous();// TNC|BS
        iterator.set("Thor"); //Brucce is replaced with thor -> TNC|TS
        System.out.println(staff);
        /*The hasNext method is used to determine if there is a next node
         * after the iterator. The hasNext is often used in the condition of a while loop
         */
        iterator = staff.listIterator(); //|TNCTS
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if(n.equals("Natasha")) //TN|CTS
                {
                    iterator.remove();// T|CTS
                }
        }
        /*An enhcnacced for loop also work with linked lists */
        for(String n: staff)
        {
            System.out.println(n + "");
        }
        System.out.println();   

        /*
         * ConcurrentModificationException
         * CANNOT modify a linked list while using an iterator 
         * Unless you use the iterator to do the modiification ex iterator.remove() 
         */

        iterator = staff.listIterator();
        while(iterator.hasNext())
        {
            String n = iterator.next();
            if(n.equals("Tony"))
            {
               // staff.remove("Tony"); causes a ConcurrentModificationException
               //iterator.remove(); // this is the correct way to remove an element while using an iterator
            }
        }
        
        for(String n:staff)
        {
            if(n.equals("Tony"))
            {
                staff.add("T'Challla"); 
            }
        }
        System.out.println(staff);
    }
}
