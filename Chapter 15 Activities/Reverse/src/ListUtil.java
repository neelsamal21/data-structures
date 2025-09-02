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
       
        
        while(iterator.hasNext())
        {
            iterator.next();
        
            
        }
        
        while(iterator.hasPrevious())
        {
            String s = iterator.previous();
            it.add(s);
        }
        
        strings.clear();
        for(String s: rev)
        {
            strings.add(s);
        }
       
    }
}
