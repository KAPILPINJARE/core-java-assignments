import java.util.Scanner;

class ComplexTest
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        Complex c1 = new Complex();
        System.out.println("Enter real and imaginary part for first number");
        c1.set(sc.nextDouble(),sc.nextDouble());
        System.out.println("First complex number is = " + c1.disp());

        Complex c2 = new Complex();
        System.out.println("Enter real and imaginary part for second number");
        c2.set(sc.nextDouble(),sc.nextDouble());        
        System.out.println("Second complex number is = " + c2.disp());
        
        Complex c3;
        c3=c1.add(c2);
        System.out.println("Addition of complex number is = " + c3.disp());
   }
}