import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //Create a print queue of strings using a linked list(linked list is a queue)
        Queue<String> jobs = new LinkedList<>();

        //Add some print jobs to the queue
        jobs.add("Harry: Quarter 2 Expense report");
        jobs.add("Connor: Recipe for Banana Bread");
        jobs.add("Katherine: Top Secret Document");
        System.out.println("Printing: "+ jobs.remove());

        //add more jobs 
        jobs.add("Vardhan: Grocery List");
        jobs.add("Katherine: Really Top Secret Document");
        jobs.add("Katherine: Can I get fired for this?");
        System.out.println("Printing: "+ jobs.remove());
        System.out.println("Printing: "+ jobs.remove());

        jobs.add("Boss: Katherine Termination Letter");
        //print the rest of the queue

        /*int numjobs = jobs.size();
        for(int i = 0; i < numjobs; i++)
        {
            System.out.println("Printing: " + jobs.remove());
        }
         */
       
        
        while(jobs.size()>0)
        {
            System.out.println("Printing: " + jobs.remove());
        }
    }
}
