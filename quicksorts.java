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
    /* // for labs
     public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter n value");
    n = scanner.nextInt();
    int arr[] = new int[n];
    System.out.println("Quick Sort");
    System.out.println("1. Best/Average Case");
    System.out.println("2. Worst Case");
    int ch = scanner.nextInt();
    switch (ch) {
    case 1:
        Random random = new Random();
        for (int i = 0; i < n; i++)
        {
        arr[i] = random.nextInt();
        }
        break;
    case 2:
        for (int i = 0; i < n; i++)
        {
         arr[i] = i + 1;
        }
        break;
    }
 long start = System.nanoTime();
 quicksort(arr,0,n - 1);
 long end = System.nanoTime();
 System.out.println("Sorted Array");
 for (int i = 0; i < n; i++) {
 System.out.println(arr[i]);
 }
 System.out.println("Time taken: " + (end - start));
}
}


    
    

