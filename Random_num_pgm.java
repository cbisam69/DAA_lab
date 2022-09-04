import java.util.Random;
class Random_num_time extends Thread
{
    public void run()
    {
        Random rand;
        int i=0,m;
        do
        {
            rand=new Random();
            m=rand.nextInt(100);
            System.out.println(m);
            i++;
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }while(i<10);
    }
}

class square extends Thread
{
    int n;
    public void run()
    {
        System.out.println("square of number  is"+this.n+"is"+Math.pow(this.n,2));
    }
    public square(int a)
    {
        this.n=a;
    }
}

class cube extends Thread
{
    int n;
    public void run()
    {
        System.out.println("cune of number is"+this.n+"is"+Math.pow(this.n,3));
    }
    public cube(int a)
    {
        this.n=a;
    }
}

public class Random_num_pgm
{
    public static void main(String[]args)
    {
        Thread t1=new Random_num_time();
        t1.start();
        Thread t2=new square(3);
        t2.start();
        Thread t3=new cube(3);
        t3.start();
        
    }
}
