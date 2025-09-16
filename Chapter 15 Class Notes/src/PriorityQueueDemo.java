import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //Create a priority queue of strings
        //A priotity needs to be composed of comparable objects
        Queue<String> students = new PriorityQueue<>();
        students.add("Neel");
        students.add("Johnathon");
        students.add("Cam");
        students.add("Kaitlyn");
        students.add("Dylan");
        //The next highest priority object is moved to the front of the queue
        //When the head of the queue is removed
        /* 
        while(students.size()>0)
        {
          //  System.out.println(students.remove());
        }
        */
        //create a to do list 
        //The work order class has a priority and description
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        //Lower priority is more important
        toDo.add(new WorkOrder(3, "water plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1,"Conquer World"));
        toDo.add(new WorkOrder(9,"Play Video Games"));
        toDo.add(new WorkOrder(1,"Study for the Chapter 15 Test"));
        
        //Objects are NOT stored in priority order
        System.out.println(toDo);

        //Objects will be removed in priority order
        while(toDo.size()>0)
        {
            System.out.println("Next: " + toDo.remove());
        }

    }
}
