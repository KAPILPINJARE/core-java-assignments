package com.capgemini.main;

import java.util.Objects;

public class Television
{
	private String company;
	private String type; //(LCD, LED, Plasma)
	private boolean _3Denabled;
	private int price;
	
	public Television()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String company, String type, boolean _3Denabled, int price)
	{
		super();
		this.company = company;
		this.type = type;
		this._3Denabled = _3Denabled;
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

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public boolean is_3Denabled()
	{
		return _3Denabled;
	}

	public void set_3Denabled(boolean _3Denabled)
	{
		this._3Denabled = _3Denabled;
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
	public String toString()
	{
		return "Television [company=" + company + ", type=" + type + ", _3Denabled=" + _3Denabled + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(company,price,type);
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
		Television other = (Television) obj;
		if (company == null)
		{
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null)
		{
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
