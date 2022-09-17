//Write a program to display first and last element of an array of size 10.
import java.util.Scanner;

class FirstAndLast
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      int a[] = new int[10];
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.println("The first element is: " + a[0]);
      System.out.println("The last element is: " + a[a.length - 1]);
       sc.close();
    }
}
