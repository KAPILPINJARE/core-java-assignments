package corejava.basic;

public class ArmStrongRange
{
	public static void main(String[] args)
	{
		for(int i = 100; i<= 999; i++)
		{
			int number = i;
			int result = 0;
			while (number != 0)
			{
				int reminder = number % 10;
				result = result + (reminder*reminder*reminder);
				number /= 10;
			}
			if (i==result)
			{
				System.out.print(result + ",");
			}
		}
	}
}
