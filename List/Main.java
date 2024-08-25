import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> nums =  new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        //CAN print the array without a loop
        System.out.println(nums.get(2)); //accessing element by indexing
        System.out.println(nums.indexOf(5)); //getting index of element

        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}