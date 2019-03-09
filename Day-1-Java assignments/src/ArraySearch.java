package corejava.basic;

public class ArraySearch
{
	public static void main(String[] args)
	{
		int[] array= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int valueToSearch = 19;
		boolean flag = true;
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] == valueToSearch)
			{
				System.out.println("array contains " + valueToSearch + " at index " + i);
				flag = false;
				break;
			}
		}
		
		if (flag)
		{
			System.out.println("array doesnot contains " + valueToSearch);
		}
		
		System.out.println("Sorting using bubble sort");
		
		BubbleSort(array);
		for (int i : array)
		{
			System.out.print(i + " , ");
		}
	}
	
	public static void BubbleSort(int[] arr) 
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
