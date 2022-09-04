import java.util.*;
class Staff
{
    private String Staffid;
    private String Name;
    private String Phone;
    private String Salary;
    
    public Staff(String STAFFID,String NAME,String PHONE,String SALARY)
    {
     Staffid=STAFFID;
     Name=NAME;
     Phone=PHONE;
     Salary=SALARY;
    }
    public void display()
    {
        System.out.println(Staffid);
        System.out.println(Name);
        System.out.println(Phone);
        System.out.println(Salary);
        
    }
    
}

class Teaching extends Staff
{
    private String Domain;
    private String Publications;
    public Teaching(String STAFFID,String NAME,String PHONE,String SALARY,String DOMAIN,String PUBLICATIONS)
    {
        super(STAFFID,NAME,PHONE,SALARY);
        Domain=DOMAIN;
        Publications=PUBLICATIONS;
    }
    public void display()
    {
        super.display();
        System.out.println(Domain);
        System.out.println(Publications);
    }
}
class Technical extends Staff
{
    private String Skills;
    public Technical(String STAFFID,String NAME,String PHONE,String SALARY,String SKILLS)
    {
        super(STAFFID,NAME,PHONE,SALARY);
        Skills=SKILLS;
    }
    public void display()
    {
        super.display();
        System.out.println(Skills);
    }
}
class Contract extends Staff
{
    private String Period;
    public Contract(String STAFFID,String NAME,String PHONE,String SALARY,String PERIOD)
    {
        super(STAFFID,NAME,PHONE,SALARY);
         this.Period=PERIOD;
    }
    public void display()
    {
        super.display();
        System.out.println(Period);
    }
}

    
public class Main
{
    public static void main(String[]args)
    {
            
        String Staffid;
        String Name;
        String Phone;
        String Salary;
        String Period;
        String Skills;
        String Domain;
        String Publications;
        Scanner sc=new Scanner(System.in);
        Staff st[]=new Staff[50];
        System.out.println("enter teaching staff");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter details of "+(i)+" th staff");
            Staffid=sc.next();
            Name=sc.next();
            Phone=sc.next();
            Salary=sc.next();
            Domain=sc.next();
            Publications=sc.next();
            st[i]=new Teaching(Staffid,Name,Phone, Salary,Domain,Publications);
        }
         System.out.println("enter the number of technical  staff");
         int m=sc.nextInt();
         for(int i=n+1;i<=m+n;i++)
         {  System.out.println("enter details of "+(i)+" th staff");
            Staffid=sc.next();
            Name=sc.next();
            Phone=sc.next();
            Salary=sc.next();
            Skills=sc.next();
            st[i]=new Technical(Staffid,Name,Phone, Salary,Skills);
         }
         System.out.println("enter the number of contract  staff");
         int p=sc.nextInt();
         for(int i=n+1;i<=m+n;i++)
         {  System.out.println("enter details of "+(i)+" th staff");
            Staffid=sc.next();
            Name=sc.next();
            Phone=sc.next();
            Salary=sc.next();
            Period=sc.next();
            st[i]=new Contract(Staffid,Name,Phone, Salary,Period);
         }
         
         System.out.println("the details are");
         for(int i=1;i<n+m+p;i++)
         {
             st[i].display();
             System.out.println();
             
         }
    }
}
