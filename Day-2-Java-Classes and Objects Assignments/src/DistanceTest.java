import java.util.Scanner;

class DistanceTest
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        Distance d1 = new Distance();
        System.out.println("Enter feet and inches of first distance ");
        d1.set(sc.nextInt(),sc.nextDouble());
        System.out.println("First distance = " + d1.disp());

        Distance d2 = new Distance();
        System.out.println("Enter feet and inches of second distance ");
        d2.set(sc.nextInt(),sc.nextDouble());
        System.out.println("Second distance = " + d2.disp());
        
        Distance d3;
        d3=d1.add(d2);
        System.out.println("Addition of both distances is = " + d3.disp());
   }
}