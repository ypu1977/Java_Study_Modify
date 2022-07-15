package com.iu.terran;

import com.iu.unit.Unit;

public abstract class Scv extends Unit
{
	public void attack()
	{
		System.out.println("공격,.,");
	}
	
	public void work()
	{
		System.out.println("일하기");
	}
	
	//오버라이딩
	public void move()
	{
		System.out.println("이동");
	}
}
