package corejava.basic;

import java.util.Scanner;

public class SimpleCompoundIntrest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle");
		int principle = sc.nextInt();
		System.out.println("enter rate");
		double rate = sc.nextDouble();
		System.out.println("enter time");
		int time = sc.nextInt();
		sc.close();
		int n = 12;//n is 12 if monthly;or2 if it is semi yearly
		double simpleInterest = (principle * rate * time);
		
		double compoundInterest = principle * (((Math.pow((1+(rate/(n))),(n*time)))));
		
		System.out.println("simple interest = " + simpleInterest);
		System.out.println("compound interest = " + compoundInterest);
	}
}
