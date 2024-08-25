import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        Set<Integer> nums =  new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(6); // cant have a repeatedvalue


        for(int n : nums)
        {
            System.out.println(n); // output is sorted. follows sequence
        }
    }
}