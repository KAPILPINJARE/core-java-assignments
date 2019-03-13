package main;

public class Country
{
	private String countryName;
	private int population;	
	private int area;
	
	public Country()
	{}

	public Country(String countryName,int population, int area)
	{
		this.countryName = countryName;
		this.population = population;
		this.area = area;
	}

	public int getArea()
	{
		return area;
	}
	public int getPopulation()
	{
		return population;
	}
	public String getCountryName()
	{
		return countryName;
	}	
		
	public Country getLargestArea(Country[] country)
	{
		int max = country[0].area;
		int index = 0;
		for(int i = 0; i< country.length;i++)
		{
			if(country[i].area>max)
			{
				max = country[i].area;
				index = i;
			}
		}
		return country[index];
	}

	public Country getLargestPopulation(Country[] country)
	{
		int max = country[0].population;
		int index = 0;
		for(int i = 0; i< country.length;i++)
		{
			if(country[i].population>max)
			{
				max = country[i].population;
				index = i;
			}
		}
		return country[index];
	}

	public Country getLargestPopulationDensity(Country[] country)
	{
		double max = country[0].population/country[0].area;
		int index = 0;
		for(int i = 0; i< country.length;i++)
		{
			if(country[i].population/country[i].area>max)
			{
				max = country[i].population/country[i].area;
				index = i;
			}
		}
		return country[index];
	}
}