import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.
        Stack<String> word = new Stack<>();
        String output = "";
        String x = "";
        String reverse1 = "";
        while(scanner.hasNext())
        {
        	x = scanner.next();
        	if(!x.contains("."))
            {
                word.push(x.toLowerCase());

            }
            else{
                word.push(x.substring(0, x.length()-1).toLowerCase());
                int size = word.size();
                for(int i = 0; i<size; i++)
                {
                    reverse1 = word.pop() + " ";
                    if(i == 0)
                    {
                        output = reverse1.substring(0,1).toUpperCase() + reverse1.substring(1);
                    }
                    else if(i == size -1)
                    {
                        output = output + reverse1.substring(0,reverse1.length()-1) + ".";
                    }
                    else
                    {
                        output = output + reverse1;
                        
                    }
                }
            }

        }
        return output;







    }
}
