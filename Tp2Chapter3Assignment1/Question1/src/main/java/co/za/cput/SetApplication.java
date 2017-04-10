package co.za.cput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public class SetApplication {
    private Set<Integer> numbers = new HashSet();
    private static Scanner scan = new Scanner(System.in);

    public SetApplication(){
        numbers.add(3);
        numbers.add(27);
        numbers.add(9);
        numbers.add(30);
        numbers.add(93);
        numbers.add(13);

        System.out.println("Numbers List:" + numbers);
        TreeSet<Integer> sorted = new TreeSet(numbers);
        System.out.println("Sorted numbers List:" + sorted);
    }

    public String getNumber(int number)
    {
         if(numbers.contains(number))
        {
            System.out.println("The number is in the list");
            return "The number is in the list";

        }
        else
            System.out.println("The number is NOT in the list");
            return "The number is NOT in the list";

    }

    public static void main (String[]args)
    {
        SetApplication set = new SetApplication();
        System.out.println("\nPlease enter any number you wish to search for in the above list: ");
        int search = scan.nextInt();
        set.getNumber(search);
    }


}
