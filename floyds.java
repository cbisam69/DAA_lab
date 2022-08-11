import java.util.*;
class floyds{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int D[][],graph[][],v;
        int i=0;
        int j=0;
        int k=0;
        System.out.println("enter the number of vertices");
        v=sc.nextInt();
        D= new int[v][v];
        graph= new int[v][v];
        System.out.println("enter the adjacency matrix");
        for(i=0;i<v;i++)
        {
            for(j=0;j<v;j++)
            {
                graph[i][j]=sc.nextInt();
                
            }
        }
        for(i=0;i<v;i++)
        {
            for(j=0;j<v;j++)
            {
                D[i][j]=graph[i][j];
                
            }
        }
     for(k=0;k<v;k++)
     {
        for(i=0;i<v;i++)
        {
            for(j=0;j<v;j++)
            {
                if(D[i][k]+D[k][j]<D[i][j])
                {
                D[i][j]= D[i][k]+D[k][j]; 
                }
                
            }
        }
      }    
    
    System.out.println("Distance matrix is");
    for(i=0;i<v;i++)
    {
        System.out.println(D[i][j]+" ");
    }
    }
}    
  
    
    
