//1. Display first and last character of a string
import java.util.Scanner;
public class FirstLast
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        System.out.println("The first character is: " + first);
        System.out.println("The last character is: " + last);
    }
}