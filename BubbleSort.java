//32. Write a program to store 15 numbers in array and sort it by using Bubble sorting technique.days
import java.util.Scanner;

class BubbleSort
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a[] = new int[10];
    System.out.println("Enter the inputs: ");
    for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
    
    for (int j = 0; j<a.length; j++)
    {
        for (int k = 0; k<a.length - 1 - j; k++)
        {
            if(a[k] > a[k+1])
            {
                int temp = a[k];
                a[k] = a[k+1];
                a[k+1] = temp;
            }
        }
    }
    
      
      
    
    for(int i =0;i<a.length;i++)
      {
        System.out.println("An element in a is: " + a[i]);
      }
    
      
      
      
    sc.close();
}
}
