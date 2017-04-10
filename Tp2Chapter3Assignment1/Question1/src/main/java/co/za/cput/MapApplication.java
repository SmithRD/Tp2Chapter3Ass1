package co.za.cput;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 */
public class MapApplication {
    private Map<String,String> students = new HashMap();
    private static Scanner scan = new Scanner(System.in);

    public MapApplication()
    {
        students.put("cyclopse", "Scott Summers");
        students.put("phoenix", "Jean Grey");
        students.put("psylock", "Elizabeth Braddock");
        students.put("angel", "Warren Worthington");

        System.out.println("Student Alias'");
        for (Map.Entry entry : students.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public String getStudent(String alias)
    {
        System.out.println("\nThe name of the student is: " + students.get(alias));
        String choice = students.get(alias);
        return choice;
    }

    public static void main (String[]args)
    {
        MapApplication map = new MapApplication();
        System.out.println("\nTo get the student's real name please enter an alias from the above list: ");
        String alias = scan.nextLine();
        map.getStudent(alias);
    }
}
