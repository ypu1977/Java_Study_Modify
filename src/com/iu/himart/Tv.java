package com.iu.himart;

import com.iu.himart.Product;

public class Tv extends Product
{
	private int size;
	
	public Tv()
	{
		this.size = 100;
		this.setBrand("MSI");
		this.setPrice(20000000);
		this.setPoint(200);
	}
	
	public void info()
	{
		super.info();
		System.out.println(this.getSize());
	}

	public double getSize() 
	{
		return size;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}
}