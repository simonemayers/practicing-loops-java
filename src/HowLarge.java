import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        ArrayList<String> list = new ArrayList<String>();

        while(!string.equals("")){
            list.add(string);
            string = input.nextLine();

        }
        System.out.println("The total amount of items in the list was: " + list.size());
    }
}
