package corejava.basic;

import java.util.Scanner;

public class ResultDeclare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Marks of physics");
		int physics = sc.nextInt();
		System.out.println("Marks of chemisty");
		int chemistry = sc.nextInt();
		System.out.println("Marks of maths");
		int maths = sc.nextInt();
		sc.close();
		if (physics>60 && chemistry>60 && maths>60)
		{
			System.out.println("passed");
		}
		else if ((physics>60 && chemistry>60 && maths<60) || (physics>60 && maths>60 && chemistry<60) || (maths>60 && chemistry>60 && physics<60))
		{
			System.out.println("promoted");
		}
		else
        {
        	System.out.println("failed");
        }
		
		
	}
}
