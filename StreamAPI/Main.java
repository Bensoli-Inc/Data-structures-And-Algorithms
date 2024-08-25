import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
       
    //    Consumer<Integer> con = new Consumer<Integer>()
    //     {
    //         public void accept(Integer n)
    //         {
    //             System.out.println(n);
    //         }
    //     }

    //     nums.forEach(con);

        nums.forEach(n -> System.out.println(n));
        
        System.out.println(".............");

        Stream<Integer> s1 = nums.stream(); //cannot re-use the stream
        // s1.forEach(n -> System.out.println(n));

        //STREAM METHODS - filter
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // s2.forEach(n -> System.out.println(n));

        //double
        Stream<Integer> s3 = s2.map(n -> n*2);
        s3.forEach(n -> System.out.println(n));

        // int sum = 0;
        // for(int n : nums)
        // {
        //     if(n%2==0)
        //     {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(sum);
    }
}