//8. WAP to display maximum element in an array 
import java.util.Scanner;

class MaxElement
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      int a[] = new int[10];
      
      System.out.println("Input:");
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      int max = a[0];
      for(int i=0;i<a.length;i++)
      {
        if (a[i] >= max )
        {
            max = a[i];
        }
       
      }
      System.out.println("The max in the array is: " + max);
      
       sc.close();
    }
}
