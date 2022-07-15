package com.iu.terran;

import com.iu.unit.AirUnit;

public class Race extends AirUnit 
{
	//비행기
	public void move()
	{
		System.out.println("고속비행");
	}
	
	public void attack()
	{
		System.out.println("미사일");
	}
}
