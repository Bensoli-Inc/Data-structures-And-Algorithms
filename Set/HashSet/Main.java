import java.util.Set;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        Set<Integer> nums =  new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6); // cant have a repeatedvalue


        for(int n : nums)
        {
            System.out.println(n); // cant follow sequence
        }
    }
}