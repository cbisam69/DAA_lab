

import java.util.Scanner;
class Student
{
    String USN;
    String NAME;
    String BRANCH;
    String PHONE;
    
    public Student(String usn,String name,String branch,String phone)
    {
        USN=usn;
        NAME=name;
        BRANCH=branch;
        PHONE=phone;
    }
}

class Main
{
    public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int n=sc.nextInt();
        String usn,name,branch,phone;
        Student st[]=new Student[n];
        for(int i=0;i<n;i++)
        {
          System.out.println("enter the details of "+(i+1)+"th student");
          System.out.println();
          System.out.println("enter the usn");
          usn=sc.next();
          System.out.println("enter name");
          name=sc.next();
          System.out.println("enter the branch");
          branch=sc.next();
          System.out.println("enter the phone number");
          phone=sc.next();
          st[i]=new Student(usn,name,branch,phone);
        }
        System.out.println("The details are");
        for(int j=0;j<n;j++)
        {
            System.out.println("usn-->"+st[j].USN);
            System.out.println("name-->"+st[j].NAME);
            System.out.println("branch-->"+st[j].BRANCH);
            System.out.println("phone-->"+st[j].PHONE);
            System.out.println();
        }        
    }
}
