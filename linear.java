
import java.util.*;

class java
{
    public static int search(int arr[],int x)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==x)
            {
                return j;
            }
        }
        return -1;
    }
    
    
  public static void main(String []args)
  {   int arr[],searchele,n;
       Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of elements");
      n=sc.nextInt();
      System.out.println("enter the elements");
      arr=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("enter the element to search");
      searchele=sc.nextInt();
      int result = search(arr, searchele);
      if (result == -1)
      System.out.print("element is not present");
      else
      System.out.print("Element is present at index "+ result);
  }
  
}
