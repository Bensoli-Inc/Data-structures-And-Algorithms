import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString()
    {
        return "Student [age=" +age + ", name=" + name + "]";
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Comparator<Student> com = new Comparator<Student>()
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Ben"));
        studs.add(new Student(27, "Alex"));
        studs.add(new Student(19, "Kate"));
        studs.add(new Student(34, "Mark"));
        

        //SORTING based on age
        Collections.sort(studs, com); 
        for(Student s : studs)
        {
            System.out.println(s);
        }

    }
}