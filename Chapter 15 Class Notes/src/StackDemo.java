import java.util.Stack;

/**
 * This program simulates an undo stack. Note that operations
 * must be undone in the opposite order in which they are first
 * issued.
*/
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<String> commands = new Stack<>();
        //Push a bunch of commands onto the stack
        commands.push("insert: 'Hello'");
        commands.push("insert: ', '");
        commands.push("Insert: ' '");
        commands.push("insert: 'World'");
        commands.push("Insert: '?'");
        commands.push("delete: '?'");
        commands.push("insert: '!'");
        //top of stack is far right the !
        System.out.println("Current stack: " + commands);
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Undo: " + commands.pop());
        }
        System.out.println("Current stack: " + commands);
    }
}
