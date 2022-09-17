//34. Write a program to store 10 elements in an array and delete a particular element as inputted by the user and display the resultant array.
import java.util.Scanner;

class DeleteElement
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a[] = new int[10];
    System.out.println("Enter the inputs: ");
    for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
    
    int b[] = new int[9];
    System.out.println("Enter the number you want to delete: ");
    int delete = sc.nextInt();
    int k = 0;
    for (int i = 0; i < a.length; i++)
    {
        if (a[i] != delete)
        {
            
            System.out.println("THe value of k is: " + k);
            b[k] = a[i];
            k += 1;
        }
    }
    
    
    for(int j=0;j<b.length;j++)
    {
        System.out.println("An element in the new array is: " + b[j]);
    }
    
      
    
    
    sc.close();
}
}
