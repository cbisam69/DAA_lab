// Write a Java program to read two integers a and b. Compute a/b and print, 
// when b is not zero. Raise an exception when b is equal to zero


// Write a Java program to read two integers a and b. Compute a/b and print, 
// when b is not zero. Raise an exception when b is equal to zero


import java.util.*;
public class raise_den_exp
{ 
  public static sop(String text)
  {
    System.out.println(text);
  }  
  public static void main(String[]args)
  {
    int a,b,quotient;
    Scanner sc=new Scanner(System.in);
    sop("enter the first number (numerator)");
    a=sc.nextInt();
    sop("enter the second number (denomintor)");
    b=sc.nextInt();
    try
    {
      quotient=a/b;
      sop("Quotient is"+quotient);
    }
    catch(ArithmeticException ae)
    {
      System.out.println(ae);
    }
  }    
      
    
    
    
