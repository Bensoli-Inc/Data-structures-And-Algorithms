import java.util.Collection;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Collection<Integer> nums =  new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        //CAN print the array without a loop
        System.out.println(nums);

        //printing 1 by 1
        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}