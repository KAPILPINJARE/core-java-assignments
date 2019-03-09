package corejava.basic;

import java.util.Scanner;

public class LoginValidation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String userName;
		String password;
		for (int i = 1; i <= 3; i++)
		{
			if(i==3)
			{
				System.out.println("contact admin");
				break;
			}
			else if (i>1)
			{
				System.out.println("try again");
			}
			
			System.out.println("Enter user name");
			userName = sc.nextLine();
			System.out.println("Enter password");
			password = sc.nextLine();
			sc.close();
			if (userName.equals("kapil") && password.equals("Kapsrockers"))
			{
				System.out.println("Welcome " + userName);
				break;
			}
		}
	}
}
