import java.util.*;


class quicksorts{
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[],int low,int high)
    {
        int i,j;
        int pivot=arr[low];
        i=low;
        j=high;
        while(i<j)
        {
            while(pivot>=arr[i])
            i++;
            while(pivot<arr[j])
            j--;
            
            if(i<j)
            swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    static void quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int p=partition(arr,low,high);
            quicksort(arr,low,p-1);
            quicksort(arr,p+1,high);
        }
    }
    static void print(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    { 
        
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number of element");
    int n= sc.nextInt();
    int arr[];
    arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    
      
    quicksort(arr, 0, n - 1);
    System.out.println("Sorted array: ");
    print(arr, n);
    }
    
}
