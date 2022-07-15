package com.iu.ex1;

public class Iu 
{
	private String name;
	private int age;
	
	private static Iu iu=null;
	
	//문제
	private Iu()
	{		
	}
	
	//멤버 메소드 --> static 필요
	public static Iu getInstance() //객체를 생성하지 않고 사용가능
	{
		if(Iu.iu == null)
		{
			Iu.iu = new Iu();
		}
		return Iu.iu; //없으면 새로 만들고 있으면 기존에 있는거 사용
	}
	
	public String getName() 
		
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	//Setter
	//public void set변수명(데이터타입 변수명){}
	
	//Getter
	//public 리턴타입 get변수명(){}
	
}