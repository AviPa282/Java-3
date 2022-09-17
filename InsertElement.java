//35. Write a program to store 10 elements in an array and insert element as inputted by the user and display the resultant array.
import java.util.Scanner;

class InsertElement
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a[] = new int[10];
    System.out.println("Enter the inputs: ");
    for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
    
    int b[] = new int[11];
    System.out.println("Enter the number you want to insert: ");
    int insert = sc.nextInt();
    System.out.println("Enter the place you want to insert: ");
    int place = sc.nextInt();
    int temp = 0;
    for (int k = 0; k < b.length; k++)
    {
        if (place == k)
        {
            b[k - 1] = insert;
            b[k] = a[temp - 1];
        }
        else
        {
            b[k] = a[temp];
            temp += 1;
        }
        
    }
    
    for(int j=0;j<b.length;j++)
    {
        System.out.println("An element in the new array is: " + b[j]);
    }
    
      
    
    
    sc.close();
}
}
