import java.util.*;
class Main{
 static void merge(int a[], int beg, int mid, int end)    
{    
    int i, j, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
      
    int A[]= new int[n1];
    int B[]= new int[n2];
      
     
    for (i = 0; i < n1; i++)    
    A[i] = a[beg + i];    
    for (j = 0; j < n2; j++)    
    B[j] = a[mid + 1 + j];    
      
    i = 0;  
    j = 0; 
    k = beg;
      
    while (i < n1 && j < n2)    
    {    
        if(A[i] <=B[j])    
        {    
            a[k] = A[i];    
            i++;    
        }    
        else    
        {    
            a[k] = B[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] = A[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] = B[j];    
        j++;    
        k++;    
    }    
}    
  
 static void mergeSort(int a[], int beg, int end)  
{  
    if (beg < end)   
    {  
        int mid = (beg + end) / 2;  
        mergeSort(a, beg, mid);  
        mergeSort(a, mid + 1, end);  
        merge(a, beg, mid, end);  
    }  
}  
  
 static void printArray(int a[], int n)  
{  
    int l;  
    for (l = 0; l < n; l++)  
    System.out.println(a[l]);  
    System.out.println("\n");  
}  

public static void main(String[]args)  
{   Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of element");
    int n= sc.nextInt();
    int a[];
    a= new int[n];
    int m;  
    for (m = 0; m < n; m++)  
    {
        a[m]=sc.nextInt();
    }
    System.out.println("Before sorting array elements are -");  
    printArray(a, n);  
    mergeSort(a, 0, n - 1);  
    System.out.println("After sorting array elements are - \n");  
    printArray(a, n);  
     
} 

}
