package com.capgemini.inheritanceassignments.main;

public class PublicTraining extends Training
{
	private int participants;

	public PublicTraining()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PublicTraining(int id, String subject, int fees, int participants)
	{
		super(id, subject, fees);
		this.participants = participants;				
	}



	public int getParticipants()
	{
		return participants;
	}

	public void setParticipants(int participants)
	{
		this.participants = participants;
	}

	public int getOrderValue()
	{
		return (getFees() * participants);
	}
	
}
