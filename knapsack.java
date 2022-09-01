import java.util.*;
public class Main
{
	public static void main(String[]args)
	{  Scanner sc= new Scanner(System.in);
		int n,W;
		System.out.println("enter the number of items");
		n=sc.nextInt();
		System.out.println("enter the capacity of sack");
		W=sc.nextInt();
		int w[]=new int[n+1];
		int V[]=new int[n+1];
		for(int i=1;i<n+1;i++)
		{
            w[i]=sc.nextInt();
		}
		for(int i=1;i<n+1;i++)
		{
            V[i]=sc.nextInt();
		}
		int v[][]= new int[n+1][W+1];
		for(int j=0;j<=W;j++)
		{   v[0][j]=0;

		}
			for(int i=0;i<=n;i++)
			{
              v[i][0]=0;
			}
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=W;j++)
		{
			if(j>=w[i])
			{
				v[i][j]=Math.max(v[i-1][j],V[i]+v[i-1][j-w[i]]);
			}
			else
			{
				v[i][j]=v[i-1][j];
			}
		}
		}
		int x=v[n][W];
		System.out.println(x);



	}

}
