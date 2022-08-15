import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Main
{   
    
    public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int INF = 99999;
      int i, j, k;
      System.out.println("enter the no. of vertex");
      int V=sc.nextInt();
      int graph[][] = new int[V][V];
        System.out.println("enter the adjacency matrix");  
        
        for (i=0; i<V;i++)
        {
            for (j=0; j<V;j++)
            {  
                graph[i][j]=sc.nextInt();
            
            }
        } 
        int dist[][] = new int[V][V];
        for (i = 0; i < V; i++)
        {
            for (j = 0; j < V; j++)
            {
                dist[i][j] = graph[i][j];
            }
        }    

        for (k = 0; k < V; k++)
        {
            
            for (i = 0; i < V; i++)
            {
                for (j = 0; j < V; j++)
                {
                    
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }
 
        
 
        System.out.println("The following matrix shows the shortest "+"distances between every pair of vertices");
        for (i=0; i<V;i++)
        {
            for (j=0; j<V;j++)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    
    }
}
 
