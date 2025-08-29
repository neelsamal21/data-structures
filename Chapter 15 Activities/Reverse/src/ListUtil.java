import java.util.LinkedList;
import java.util.ListIterator;
/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();
        LinkedList<String> rev = new LinkedList<>();
        ListIterator<String> it = rev.listIterator();
       
        

        for(int i = 0; i < strings.size(); i++)
        {
            String s = iterator.next();
        
            it.add(s);
            it.previous();
        }
        while(iterator.hasNext())
        {
             iterator.next();
            iterator.remove();
        }
        while(iterator.hasNext())
        {
            String s = it.next();
            iterator.add(s);
        }
        System.out.println(strings);
    }
}