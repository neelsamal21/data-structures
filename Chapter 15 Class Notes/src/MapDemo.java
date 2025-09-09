import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
         * the map interface is generic
         * the first type given is the key
         * the second type given is the value
         */
        Map<String, Color> favColors = new HashMap<>();
        // Add elemnets using the put method
        favColors.put("Sreeram",Color.GREEN);
        favColors.put("Kaitlyn",Color.GREEN);
        favColors.put("Cam",Color.BLUE);
        favColors.put("Nimai",Color.RED);
        //the same key cannot have 2 different values
        //using put on a key thate exists changes the value
        favColors.put("Cam",Color.ORANGE);

        //Create a set of keys in a map
        Set<String> keys = favColors.keySet();
        for(String key: keys)
        {
            System.out.println(key + "(" + key.hashCode() + "): )" + favColors.get(key));
        }

    }
}
