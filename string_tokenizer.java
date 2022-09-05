import java.util.*;
import java.io.*;
import java.util.StringTokenizer;
class  Customer
{
    private String name;
    private String date_of_birth;
    
    public Customer(String Name,String Date_of_birth )
    {
        name=Name;
        date_of_birth=Date_of_birth;
    }
    
    public void display()
    {
        StringTokenizer st=new StringTokenizer(date_of_birth,"/");
        System.out.println(name);
        while(st.hasMoreTokens())
        {
            System.out.println(","+st.nextToken());
        }
        
    }
}

public class Main
{ 
    public static void main(String[]args)
    {  Scanner sc= new Scanner(System.in);
       String name;
       String date;
       System.out.println("enter the name");
       name=sc.next();
       System.out.println("enter the date of birth");
       date=sc.next();
       Customer cst=new Customer(name,date);
       cst.display();
       
    }  
}
