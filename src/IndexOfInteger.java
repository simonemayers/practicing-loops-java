import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(n != 0){
            list.add(n);
            n = input.nextInt();
        }
        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list? ");
        int n2 = input.nextInt();
        System.out.println(n2 + " is at index " + list.indexOf(n2));
        System.out.println(n2 + " is at index " + (list.get(n2)-1));

    }
}
