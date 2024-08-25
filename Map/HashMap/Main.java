import java.util.Map;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        //map takes key and value
        Map<String, Integer> students = new HashMap<>(); //hashmap is the class which implements map

        //adding values
        students.put("Ben", 88);
        students.put("Alex", 99);
        students.put("Kate", 92);
        students.put("Joan", 76);
        students.put("Ben", 66);

        //printing the map
        System.out.println(students); //not sorted

        //printing one element
        System.out.println(students.get("Ben"));

        //printing all the keys
        System.out.println(students.keySet());

        //printing all values with for loop
        for(String key: students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}