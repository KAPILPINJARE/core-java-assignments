package test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import main.Country;

public class CountryTest
{
	Country country[] = new Country[3];

	@Before
	public void setUp()
	{
		country[0] = new Country("ind",12345,78945);	
		country[1] = new Country("US",145,8945);	
		country[2] = new Country("uk",123545,2945);	
	} 

	@Test
	public void testLargestAreaCheckWithArea()
	{
		Country c1 = new Country();
		Country c2 = new Country("ind",12345,78945);
		assertEquals(c2.getArea(),c1.getLargestArea(country).getArea());
	}
	
	@Test
	public void testLargestAreaCheckWithName()
	{
		Country c1 = new Country();
		Country c2 = new Country("ind",12345,78945);
		assertEquals(c2.getCountryName(),c1.getLargestArea(country).getCountryName());
	}

	@Test
	public void testLargestAreaCheckWithPopulation()
	{
		Country c1 = new Country();
		Country c2 = new Country("ind",12345,78945);
		assertEquals(c2.getPopulation(),c1.getLargestArea(country).getPopulation());
	}

	@Test
	public void testLargestPopulationCheckWithArea()
	{
		Country c1 = new Country();
		Country c2 = new Country("uk",123545,2945);
		assertEquals(c2.getArea(),c1.getLargestPopulation(country).getArea());
	}
	
	@Test
	public void testLargestPopulationCheckWithName()
	{
		Country c1 = new Country();
		Country c2 = new Country("uk",123545,2945);
		assertEquals(c2.getCountryName(),c1.getLargestPopulation(country).getCountryName());
	}

	@Test
	public void testLargestPopulationCheckWithPopulation()
	{
		Country c1 = new Country();
		Country c2 = new Country("uk",123545,2945);
		assertEquals(c2.getPopulation(),c1.getLargestPopulation(country).getPopulation());
	}
	
	@Test
	public void testLargestPopulationDensityCheckWithArea()
	{
		Country c1 = new Country();
		Country c2 = new Country("uk",123545,2945);
		assertEquals(c2.getArea(),c1.getLargestPopulationDensity(country).getArea());
	}
	
	@Test
	public void testLargestPopulationDensityCheckWithName()
	{
		Country c1 = new Country();
		Country c2 = new Country("uk",123545,2945);
		assertEquals(c2.getCountryName(),c1.getLargestPopulationDensity(country).getCountryName());
	}

	@Test
	public void testLargestPopulationDensityCheckWithPopulation()
	{
		Country c1 = new Country();
		Country c2 = new Country("uk",123545,2945);
		assertEquals(c2.getPopulation(),c1.getLargestPopulationDensity(country).getPopulation());
	}	
}