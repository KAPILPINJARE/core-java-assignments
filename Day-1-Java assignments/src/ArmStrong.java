package corejava.basic;

import java.util.Scanner;

public class ArmStrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int result = 0;
		int temp = number;
		while (number != 0)
		{
			int reminder = number % 10;
			result = result + (reminder*reminder*reminder);
			number /= 10;
		}
		if (result==temp)
		{
			System.out.println(temp + " this is armstrong");
		} 
		else
		{
			System.out.println(temp + " this is not armstrong");
		}
	}
}
