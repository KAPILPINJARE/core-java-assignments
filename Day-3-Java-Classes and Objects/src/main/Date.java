package main;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date
{
	private int d, m, y;
	public Date(int d, int m, int y)
	{
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public String toString()
	{
		return (d + "/" + m + "/" + y);
	}
	public boolean isSmaller(Date date)
	{
		if(date.y<this.y)
		{
			return true;
            	}
		else if(date.y == this.y && date.m< this.m)
		{
			return true;
		}
		else if(date.m == this.m && date.d<this.d)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public long dayDiff(Date date)
	{
		LocalDate dateBefore = LocalDate.of(date.y,date.m,date.d);
		LocalDate dateAfter = LocalDate.of(this.y,this.m,this.d);
		
		long noOfDays = ChronoUnit.DAYS.between(dateBefore,dateAfter);
		return noOfDays;
	}
	
	public int[] diff(Date date)
	{
		int arr[] = new int[3];
		int dDiff = 0;
		int mDiff = 0;
		int yDiff = 0;
		if(isSmaller(date))
		{
			yDiff = this.y - date.y;
			mDiff = (yDiff - 1) * 12 + (12-this.m) + (date.m);
			dDiff = (int) this.dayDiff(date);	
		}
		else
		{
			yDiff = date.y - this.y;
			mDiff = (yDiff - 1) * 12 + (12-this.m) + (date.m);
			dDiff = (int) date.dayDiff(this);
		}
                arr[0] = dDiff;
		arr[1] = mDiff;
		arr[2] = yDiff;
		return arr;
	}
}
