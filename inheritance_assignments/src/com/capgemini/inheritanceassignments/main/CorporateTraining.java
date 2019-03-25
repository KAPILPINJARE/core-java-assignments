package com.capgemini.inheritanceassignments.main;

public class CorporateTraining extends Training
{
	private  int daysOfTraining;

	public CorporateTraining()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public CorporateTraining(int id, String subject, int fees,int daysOfTraining)
	{
		super(id, subject, fees);
		this.daysOfTraining = daysOfTraining;
	}

	public int getDaysOfTraining()
	{
		return daysOfTraining;
	}

	public void setDaysOfTraining(int daysOfTraining)
	{
		this.daysOfTraining = daysOfTraining;
	}
	
	public int getOrderValue()
	{
		return getFees() * daysOfTraining;
	}
}
