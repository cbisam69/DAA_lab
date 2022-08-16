import java.util.*;
public class Main {
    Scanner in =new Scanner(System.in);
    float profit[],weight[],c,x[],ratio[];
    float tc =0;
    int n;
    
    
    
    void input()
    {   
        System.out.println("Enter the capacity of the  knapsack : ");
        c=in.nextInt();
        
        System.out.println("Enter the number of objects");
        n=in.nextInt();    
        
        profit = new float[n];
        weight = new float[n];
        ratio = new float [n];
        x = new float[n];
        System.out.print("Enter the weights of object and profit associated to each object : ");
        
        for(int i=0;i<n;i++)
        {
            System.out.println("");
            System.out.println("weight "+(i+1)+" : ");
            weight[i]=in.nextInt();
            System.out.println("profit "+(i+1)+" : ");
            profit[i]=in.nextInt();
            ratio[i]=profit[i]/weight[i];
            x[i]=0;
        }
    }

    void knapsack_func()
    {
        float u=c;//for current weight 
        while(u>0)
        {
            int mini=0;
            float max=ratio[0];
            for(int i=0;i<n;i++)
            {
                if (ratio[i]>max)
                {
                    mini=i;
                    max=ratio[i];
                }
            }
            
            if(weight[mini] <= u)
            {
                x[mini]=1;
                ratio[mini]=-1;
                u=u-weight[mini];
                tc+=profit[mini];
            }         
            else 
            {
                x[mini]=u/weight[mini];
                tc+=profit[mini]*x[mini];
                break ;
            }
        }

    }
    void display()
    {
        for(int i=0;i<n;i++)
        {   
            System.out.println("Include "+weight[i]*x[i]+" gram "+"of object number "+(i+1));
        }
        System.out.println("Total profit is  : "+tc);
           
    }
    public static void main(String[] args)  
    {
        Main obj =new Main();
        obj.input();
        obj.knapsack_func();
        obj.display();
    }
}
