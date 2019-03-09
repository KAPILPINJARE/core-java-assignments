package corejava.basic;

import java.util.Scanner;

public class StudentMarksCalculatorByArray
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of students");
		int student = sc.nextInt();
		
		System.out.println("enter no. of subjects");
		int subjects = sc.nextInt();
		
		int[][] arr = new int[student][subjects];
		
		for(int i = 0;i<student;i++)
		{
			for(int j = 0;j<subjects;j++)
			{
				System.out.println("enter student " + (i+1) + " subject " + (j+1) +" marks is " );
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for(int i = 0;i<student;i++)
		{
			int total=0;
			for(int j = 0;j<subjects;j++)
			{
				total = total + arr[i][j];
			}
			System.out.println("Total mark of student " + (i+1) + " is " + total);
			System.out.println("Average mark of student " + (i+1) + " is " + total/subjects);
		}
		System.out.println();
	}

}
