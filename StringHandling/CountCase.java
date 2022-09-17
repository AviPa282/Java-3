//5.  Count no of lower case and uppercase characters in a String
import java.util.Scanner;
public class CountCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int uppercount = 0;
        int lowercount = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if ( Character.isUpperCase(str.charAt(i)))
            {
                uppercount += 1;
            }
            else
            {
                lowercount += 1;
            }
        }
        System.out.println("The number of uppercase letters is: " + uppercount);
        System.out.println("The number of lowercase letters is: " + lowercount);
    }
}