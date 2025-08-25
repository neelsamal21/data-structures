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
        String avenger = iterator.next();
        System.out.println(avenger); // should print Natasha);
         

    }
}
