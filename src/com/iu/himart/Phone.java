package com.iu.himart;

import com.iu.himart.Product;

public class Phone extends Product
{
	private String company;
	
	public Phone()
	{
		this.setCompany("삼성");
		this.setBrand("겔럭시");
		this.setPrice(500000);
		this.setPoint(50);
	}
	
	public void info()
	{
		super.info();
		System.out.println(this.getCompany());
	}


	public String getCompany() 
	{
		return company;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}
}