package com.capgemini.main;

import java.util.Objects;

public class Laptop
{
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	public Laptop()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(String company, String model, String operatingSystem, String processor)
	{
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getOperatingSystem()
	{
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
	}
	public String getProcessor()
	{
		return processor;
	}
	public void setProcessor(String processor)
	{
		this.processor = processor;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(company,model);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null)
		{
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null)
		{
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
}
