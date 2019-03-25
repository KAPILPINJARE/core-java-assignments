package com.capgemini.main;

import java.util.Objects;

public class School
{
	private String name;
	private String city;
	private String schoolDistrict;
	private char greatSchoolRanking;

	public School()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, String city, String schoolDistrict, char greatSchoolRanking)
	{
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getSchoolDistrict()
	{
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict)
	{
		this.schoolDistrict = schoolDistrict;
	}

	public char getGreatSchoolRanking()
	{
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(char greatSchoolRanking)
	{
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(city,name,schoolDistrict);
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
		School other = (School) obj;
		if (city == null)
		{
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null)
		{
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Student [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}

}
