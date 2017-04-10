package co.za.cput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 */

public class ListApplication {
    private List<String> birthStone = new ArrayList();
    private static Scanner scan = new Scanner(System.in);

    public  ListApplication()
    {
        birthStone.add("Garnet");
        birthStone.add("Amethyst, hyacinth, pearl");
        birthStone.add("Bloodstone, jasper");
        birthStone.add("Diamond, sapphire");
        birthStone.add("Emerald, agate");
        birthStone.add("Cat's eye, turquoise, agate");
        birthStone.add("Turquoise, onyx");
        birthStone.add("Sardonyx, carnelian, moonstone, topaz");
        birthStone.add("Chrysolite");
        birthStone.add("Opal, aquamarine");
        birthStone.add("Topaz, pearl");
        birthStone.add("Bloodstone, ruby");
    }

    public String getBirthStone(int month)
    {
        String choice = birthStone.get(month -1);
        System.out.println("Your birthstone is: " + choice);
        return choice;
    }

    public static void main (String[]args)
    {
        ListApplication list = new ListApplication();
        System.out.println("To get your birthstone name, please enter the month NUMBER of your birth: ");
        int month = scan.nextInt();
        list.getBirthStone(month);
    }
}
