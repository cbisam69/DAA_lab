import java.util.ArrayList;
import java.util.Scanner;
class Main
{
    static int[][]graph;
    static int n,src;
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of cities");
        n=sc.nextInt();
        graph=new int[n][n];
        System.out.println("enter the adjacency matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              graph[i][j]=sc.nextInt();
              
            }
        } 
        System.out.println("enter the source city");
        src=sc.nextInt();
        ArrayList<Integer> set=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(i==(src-1))
            {
                continue;
            }
            set.add(i);
        }
        int[]path=new int[n+1];//n vertex have n+1 path
        int cost=tsp(src-1,set,path);
        System.out.println("total cost "+cost);
        path[0]=src-1;
        path[n]=src-1;
        System.out.println("path is ");
        for(int i=n;i>=0;i--)
        {
            System.out.println((path[i]+1)+" ");
        }
        System.out.println();
    }


static int tsp( int v,ArrayList<Integer> set,int path[])
{
    if(set.isEmpty())
    {
        return graph[v][src-1];
    }
    int size=set.size();//set size
    ArrayList<Integer> subset;
    int mincost=Integer.MAX_VALUE;
    
    for(Integer i:set)
    {
        subset=new ArrayList<Integer>(set);
        subset.remove(i);
        int tempath[]=new int[n+1];
        int cost=graph[v][i]+tsp(i,subset,tempath);
        if(cost<mincost)
        {
            mincost=cost;
            tempath[size]=i;
            copyCentralArray(path,tempath,size);
        }
    }
    return mincost;
}

   static void copyCentralArray(int[]dest,int[]src,int size)
    {
      for(int i=1;i<=size;i++)
      {
        dest[i]=src[i];
      }
    }
}
