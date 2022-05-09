import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        ArrayList<String> list = new ArrayList<String>();

        while(!string.equals("")){
            list.add(string);
            string = input.nextLine();

        }
        System.out.println("The firth item is: " + list.get(4));
    }
}
