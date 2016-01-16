
/**
 * If we list all the natural numbers below 10 that are 
 * multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of 
 * these multiples is 23. Find the sum of all the multiples 
 * of 3 or 5 below 1000.
 * 
 * Abby Shah
 * 10/09/2015
 */
public class Problem1
{
    public static void main(String[] args)
    {
        int total_sum = 0;
        for(int i = 0; i < 1000; i++)
        {
            if(i%3 == 0 || i%5 == 0)
            {
                total_sum = total_sum + i;
            }
            else
            {
            
            }
        }
        
        System.out.println("Total sum is: " + total_sum);
    }
}
