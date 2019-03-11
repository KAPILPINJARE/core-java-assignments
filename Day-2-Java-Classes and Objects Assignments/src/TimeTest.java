import java.util.Scanner;

class TimeTest
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        Time t1 = new Time();
        System.out.println("Enter hours and minutes of first time ");
        t1.set(sc.nextInt(),sc.nextInt());
        System.out.println("First time = " + t1.disp());

        Time t2 = new Time();
        System.out.println("Enter hours and minutes of second time ");
        t2.set(sc.nextInt(),sc.nextInt());
        System.out.println("Second time = " + t2.disp());
        
        Time t3;
        t3=t1.add(t2);
        System.out.println("Addition of both time is = " + t3.disp());
   }
}