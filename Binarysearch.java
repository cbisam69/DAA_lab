import java.util.*;
class Binaryimport java.util.*;
class Binarysearch {
  int binarySearch(int array[], int x, int low, int high) {

    if (high >= low) {
      int mid = low + (high - low) / 2;

      // If found at mid, then return it
      if (array[mid] == x)
        return mid;

      // Search the left half
      if (array[mid] > x)
        return binarySearch(array, x, low, mid - 1);

      // Search the right half
      return binarySearch(array, x, mid + 1, high);
    }

    return -1;
  }

  public static void main(String args[]) {
    int array[],n,x;  
    Main Binarysearch = new Binarysearch();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    n=sc.nextInt();
    array= new int[n];
    System.out.println("the elemets in array is");
    for(int i=0;i<n;i++)
    {
        array[i]=sc.nextInt();
    }
    System.out.println("enter the elemnt to search");
     x=sc.nextInt();
    
    int result = ob.binarySearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
 {
  int binarySearch(int array[], int x, int low, int high) {

    if (high >= low) {
      int mid = low + (high - low) / 2;

      // If found at mid, then return it
      if (array[mid] == x)
        return mid;

      // Search the left half
      if (array[mid] > x)
        return binarySearch(array, x, low, mid - 1);

      // Search the right half
      return binarySearch(array, x, mid + 1, high);
    }

    return -1;
  }

  public static void main(String args[]) {
    int array[],n,x;  
    Main ob = new Main();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of elements");
    n=sc.nextInt();
    array= new int[n];
    System.out.println("the elemets in array is");
    for(int i=0;i<n;i++)
    {
        array[i]=sc.nextInt();
    }
    System.out.println("enter the elemnt to search");
     x=sc.nextInt();
    
    int result = ob.binarySearch(array, x, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
