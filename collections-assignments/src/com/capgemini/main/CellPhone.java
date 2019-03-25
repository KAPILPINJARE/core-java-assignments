package com.capgemini.main;

import java.util.Objects;

public class CellPhone
{
	private String company;
	private String model;
	private String description;
	private String operatingSystem; 
	private int price;
	
	public CellPhone()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public CellPhone(String company, String model, String description, String operatingSystem, int price)
	{
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
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

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getOperatingSystem()
	{
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(company,model,operatingSystem);
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
		CellPhone other = (CellPhone) obj;
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
		if (operatingSystem == null)
		{
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}
	
	
}
