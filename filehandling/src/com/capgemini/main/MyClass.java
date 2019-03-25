package com.capgemini.main;

import java.io.Serializable;

public class MyClass implements Serializable
{
	private String className;
	
	public MyClass()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public MyClass(String className)
	{
		this.className = className;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		return result;
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
		MyClass other = (MyClass) obj;
		if (className == null)
		{
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		return true;
	}

	
	
	
	
}
