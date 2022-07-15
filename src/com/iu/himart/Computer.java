package com.iu.himart;

import com.iu.himart.Product;

public class Computer extends Product 
{
	private String cpu;
	
	public Computer()
	{
		this.cpu = "R5 3600";
		this.setBrand("MSI");
		this.setPrice(200);
		this.setPoint(200);
	}
	
	public void info()
	{
		super.info();
		System.out.println(this.getCpu());
	}

	public String getCpu() 
	{
		return cpu;
	}

	public void setCpu(String cpu) 
	{
		this.cpu = cpu;
	}
}