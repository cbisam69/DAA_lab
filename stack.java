import java.util.*;
class Stack
{
    int capacity=3;
    int top=-1;
    int arr[]=new int[capacity];
    public void push(int ele)
    {
       if(top<capacity-1)
       {
          top++;
          arr[top]=ele;
          System.out.println("The pushed element is "+ele);
       }
     else
       {
           System.out.println("stack overflow");  
       }
    }
    public void pop()
    {
        if(top>=0)
        {
            top--;
            System.out.println("The popped element is"+arr[top+1]);
        }
        else
        {
            System.out.println("stack underflow");
        }
    }
    
    public void display()
    {
        if(top>=0)
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("stack empty");
        }
    }
    
}

public class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Stack obj=new Stack();
        while(true)
        {    
           System.out.println("enter 1 to push 2 to pop 3 to display 4 to display");
           int ch=sc.nextInt();
           switch(ch)
           {
               case 1:System.out.println("Enter the element to push");
                      int pushele=sc.nextInt();
                      obj.push(pushele);
                      break;
               case 2:obj.pop();
                      break;
               case 3:obj.display();
                      break;
               case 4:System.exit(0);          
           }
        }   
    }
}
