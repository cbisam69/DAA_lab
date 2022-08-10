import java.util.*;
class knapsack {

	static int max(int a, int b)
	{
	return (a > b) ? a : b;
	}
	static int knapSack(int W, int wt[], int val[], int n)
	{
		
		if (n == 0 || W == 0)
			return 0;
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);
		else
			return max(val[n - 1]+ knapSack(W - wt[n - 1], wt,val, n - 1),knapSack(W, wt, val, n - 1));
	}

	
	public static void main(String args[])
	{
		int val[],wt[];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of objects");
		int n= sc.nextInt();
		System.out.println("enter the total capacity of sack");
		int W=sc.nextInt();
		System.out.println("enter the values or profit");
		val=new int[n];
		for(int i=0;i<n;i++)
		{
		    val[i]=sc.nextInt();
		}
		System.out.println("enter the weights of each objects");
		wt=new int[n];
		for(int j=0;j<n;j++)
		{
		    wt[j]=sc.nextInt();
		}
		System.out.println("hence profit associate is");
		System.out.println(knapSack(W, wt, val, n));
	}
}

