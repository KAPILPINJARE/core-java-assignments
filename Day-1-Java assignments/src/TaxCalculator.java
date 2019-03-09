package corejava.basic;

import java.util.Scanner;

public class TaxCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		sc.close();
		
		if(salary >= 0 && salary <=180000)
		{
			System.out.println("slab A -> " + "Tax paid = 0");
		}
		else if (salary >= 181001 && salary <=300000)
		{
			System.out.println("slab B -> " + "Tax paid = " + (salary * 0.01));
		}
		else if (salary >= 300001 && salary <=500000)
		{
			System.out.println("slab C -> " + "Tax paid = " + (salary * 0.02));
		}
		else if (salary >= 500001 && salary <=1000000)
		{
			System.out.println("slab D -> " + "Tax paid = " + (salary * 0.03));
		}
	}
}
