import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        //Determine the current working directory
        //System.out.println(System.getProperty("user.dir"));
        
        //Read the dictionary file and the novel file
        
        Set<String> dictionaryWords = readWords("Chapter 15 Class Notes/src/words");
        Set<String> novelWords = readWords("Chapter 15 Class Notes/src/war-and-peace.txt");
        //Print all words that are in the novel but npt om the dictionary. 
        for(String word:novelWords)
        {
            if(!dictionaryWords.contains(word))
            {
                System.out.println(word);
            }
        }
        
        //number of unique words in the novel
        System.out.println("There are" + novelWords.size() + "unique words in the novel.");

        //number of unique words with >3 letters
        Iterator<String> iterator = novelWords.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next().length() <= 3)
            {
                iterator.remove();
            }
        }
        System.out.println("There are " + novelWords.size() + " unique words with more than 3 letters in the novel.");
       
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        // We use a hashset instead of a tree set because the order doesn't matter treeset used when order is important
        Set<String> words = new HashSet<>();

        Scanner in = new Scanner(new File(filename), "UTF-8");

        //Use any charaacter that's not a letter as a delimiter, breaks
        in.useDelimiter( "[^a-zA-Z]+");

        while(in.hasNext())
        {
            //Add words tp the set (duplicates are automatically ignored)
            words.add(in.next().toLowerCase());

        }
        return words;
    }
}
