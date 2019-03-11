import java.util.Scanner;

class RectangleTest
{
   public static void main(String[] args)
   {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first rectangle length and breadth");
        Rectangle r1 = new Rectangle(sc.nextInt(),sc.nextInt());
        System.out.println("Area of first rectangle = " + r1.areaOfRectangle());
        System.out.println("Perimeter of first rectangle = " + r1.perimeterOfRectangle());

        System.out.println("Enter second rectangle length and breadth");
        Rectangle r2 = new Rectangle(sc.nextInt(),sc.nextInt());
        System.out.println("Area of second rectangle = " + r2.areaOfRectangle());
        System.out.println("Perimeter of second rectangle = " + r2.perimeterOfRectangle());

        if(r1.areaOfRectangle() > r2.areaOfRectangle())
        {
            System.out.println("Area of first rectangle is greater than second");
        }
        else
        {
            System.out.println("Area of second rectangle is greater than first");
        }
   }
}