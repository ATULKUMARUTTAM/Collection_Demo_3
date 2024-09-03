import java.util.HashMap;
import java.util.Map;

//Map
public class Main {
    public static void main(String[] args) {

        Map Course_Marks = new HashMap();

        Course_Marks.put("CSF102", 75);
        Course_Marks.put("CSF301", 80);
        Course_Marks.put("CSF401", 90);

        System.out.println(Course_Marks);// {CSF301=80, CSF401=90, CSF102=75}
        System.out.println(Course_Marks.get("CSF102"));//75
        System.out.println(Course_Marks.keySet());//[CSF301, CSF401, CSF102]

        for (Object k: Course_Marks.keySet())
        {
            System.out.println(k+" : "+Course_Marks.get(k));
        }
 /*       CSF301 : 80
        CSF401 : 90
        CSF102 : 75*/


    }
}