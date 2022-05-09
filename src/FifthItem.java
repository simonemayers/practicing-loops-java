import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        //ask the user to enter a string
        System.out.println("Enter a string: ");

        // takes user input and sets it to a variable called string
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        // create an array list called list
        ArrayList<String> list = new ArrayList<String>();

        // while the users input is NOT an empty string add the string to the array list
        while(!string.equals("")){
            list.add(string);
            string = input.nextLine();
        }

        // prints out the 5th item in the list array list
        System.out.println("The fifth item is: " + list.get(4));
    }
}
