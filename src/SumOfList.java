import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (n != 0) {
            list.add(n);
            n = input.nextInt();
        }
        int sum = 0;
        StringBuilder message = new StringBuilder();

        ArrayList<Integer> list2 = new ArrayList<Integer>(list);
        int last = list.get(list.size()-1);
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        list2.remove(list2.size()-1);
        for (int i = 0; i < list2.size(); i++) {
            message.append(list2.get(i)).append(", ");
        }

        System.out.println(message + "and " + last + " were the items in the list. The sum of the list is: ");
        System.out.println(sum);
        System.out.println("What number are you looking for in the list? ");
        int n2 = input.nextInt();
        System.out.println(n2 + " is at index " + list.indexOf(n2));
    }
}
