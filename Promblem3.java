
/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * I'm so confused with this problem. I need to clarify how this works
 * with someone who understands programming logic better than I do because
 * I am so fluffin confused right now :P I'm just gonna move on to problem
 * 4 because i need to keep going but GEt HELP ON THIS ABBY 
 * 
 * Abby Shah
 * 10/10/2015
 */
public class Promblem3 
{
    public static void main(String[] args) 
    {
        System.out.println();
        double out = 0;
        double m = 600851475143d;
        for (double n = 3; n < m; n += 2) 
        {
            while (m % n == 0) 
            {
                out = n;
                m = m / n;
            }
        }
        System.out.println("" + ((m == 1)?out:m));
    }
}