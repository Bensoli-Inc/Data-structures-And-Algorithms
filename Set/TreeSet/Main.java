import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

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

        //USING ITERTOR TO PRINT ELEMENTS
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
        {
            System.out.println(values.next());
        }
        // for(int n : nums)
        // {
        //     System.out.println(n); // output is sorted. follows sequence
        // }
    }
}