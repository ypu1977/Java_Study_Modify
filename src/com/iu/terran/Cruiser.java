package com.iu.terran;

import com.iu.unit.AirUnit;

public class Cruiser extends AirUnit
{
	public void move()
	{
		System.out.println("초고속 비행");
	}
	
	public void attack()
	{
		System.out.println("유도 미사일");
	}
}
