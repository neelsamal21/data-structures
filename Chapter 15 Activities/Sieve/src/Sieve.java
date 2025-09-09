import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        Set<Integer>numbers = new HashSet<>();
        for(int i = 2;i <= n; i++)
        {
            numbers.add(i);
        }

        for(int t = 2; t*t <= n; t++)
        {
            if(numbers.contains(t))
            {
                for(int num = 2*t; num <= n;num += t)
                {
                    numbers.remove(num);
                }
            }
        }
        System.out.println("Primes up to " + n + " are " + numbers);







    }
}
