
import java.util.*;
import java.lang.*;
import java.io.*;

class warshall{
    public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
    System.out.println("enter the no. of vertices");
    int V= sc.nextInt();
    int graph[][] = new int[V][V];
    System.out.println("enter the adjacency matrix");
    int i, j, k;
   for(i=0;i<V;i++)
    {
        for (j = 0; j < V; j++) {
            graph[i][j] = sc.nextInt();
        }
    }
        int reach[][] = new int[V][V];
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                reach[i][j] = graph[i][j];


        for (k = 0; k < V; k++)
        {

            for (i = 0; i < V; i++)
            {

                for (j = 0; j < V; j++)
                {

                    reach[i][j] = (reach[i][j]!=0) ||
                            ((reach[i][k]!=0) && (reach[k][j]!=0))?1:0;
                }
            }
        }



        System.out.println("Following matrix is transitive closure"+
                " of the given graph");
        for ( i = 0; i < V; i++)
        {
            for (j = 0; j < V; j++) {
                if ( i == j)
                    System.out.print("1 ");
                else
                    System.out.print(reach[i][j]+" ");
            }
            System.out.println();
        }





    }
}

/*1 1 1 1
0 1 1 1
0 0 1 1
0 0 0 1 */
/*1 1 0 1
        0 1 1 0
        0 0 1 1
        0 0 0 1*/



