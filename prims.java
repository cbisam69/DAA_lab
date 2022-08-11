import java.util.*;
 class prims{
     
    public static void main(String[]args)
    { int k,i,j,index=0,tc=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of vertices");
      int n=sc.nextInt();
      int arr[][]=new int [n][n];
      System.out.println("enter the adjacency matrix");
      for( i=0;i<n;i++)
      {
          for( j=0;j<n;j++)
          {
              arr[i][j]=sc.nextInt(); 
          }
      }
      System.out.println("entered cost adjacency matrix is ");
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
            System.out.println(arr[i][j]+" ");
        }
      }
      int vis[]=new int[n];
      int unvis[]=new int[n];
      System.out.println("enter the source vertex");
      int sv= sc.nextInt();
      vis[sv-1]=1;
      for(i=0;i<n;i++)
      {
          if(i!=(sv-1))
          {
              vis[i]=0;
              unvis[i]=1;
          }
      }
      for(i=1;i<n;i++)
      {
          int min=999;
          for(j=0;j<n;j++)
          {
              if(vis[j]==1)
              {
                  for(k=0;k<n;k++)
                  {
                      if(unvis[k]==1&&arr[j][k]!=999)
                      {
                          if(min>arr[j][k])
                          {
                              min=arr[j][k];
                              sv=j;
                              index=k;
                              
                          }
                      }
                  }
              }
          }
          vis[index]=1;
          unvis[index]=0;
          System.out.println("add the edge from"+(sv+1)+"to"+(index+1));
          tc=tc+min;
      }
       
       System.out.println("minimum cost is"+tc);
    }
 }
