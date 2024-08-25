import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main
{
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        //SORTING
        Collections.sort(nums);
        System.out.println(nums);

        //SORTING BASED ON OWN LOGIC
        //EG SORTING BASED ON last digit

        Comparator<Integer> com = new Comparator<Integer>() //COMPARATOR
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        
        Collections.sort(nums, com); 
        System.out.println(nums);

    }
}