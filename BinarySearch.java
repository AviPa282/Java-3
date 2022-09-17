//31. Write a program to store 15 numbers in an array and search a particular number inputted by the user by using Binary Search Technique.by the user by using Linear Search Technique input is 5 output must be May has 31 days
import java.util.Scanner;

class BinarySearch
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];   
            for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int ele=sc.nextInt();
        int low=0,high=arr.length-1,mid=0;
        int pos=-1;
        while(low<=high)
        {
           mid=(low+high)/2;
           if(arr[mid]==ele)
            {
               pos=mid;
               break;
            }
           else if(arr[mid]<ele)
           {
              low=mid+1;
           }
           else
           {
               high=mid-1;
           }
        }
        if(pos==-1)
        {
          System.out.println("Element is not present.");
        }
        else
        {
          System.out.println("Element is present at: "+pos);
        }
        sc.close();
    }
}
