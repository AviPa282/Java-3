//15. Write a program to Store the names of Facebook contact in an array of size 10. Count the number of contacts which start with alphabet ‘A’. and odd numbers.
import java.util.Scanner;

class NamesWIthA
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      String a[] = new String[10];
      int count = 0;
      System.out.println("Enter name:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextLine();
      }
      
      for(int i=0;i<a.length;i++)
      {
        char firstletter = a[i].charAt(0);
        if (firstletter == 'A')
        {
            count += 1;
        }
      }
      System.out.println("The amount of names starting with A: " + count);
       sc.close();
    }
}
