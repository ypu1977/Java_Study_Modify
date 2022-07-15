package com.iu.animal;

import com.iu.animal.Cat;
import com.iu.animal.Human;

public class Main 
{
	public static void main(String[] args) 
	{
		//Cat cat = new Cat();
		//cat.sound();
		//cat.age = 5;
		Human human = new Human();
		//human.age=500;
		human.setAge(20);
		human.info();
		//-------------------------------------------------------------------------
		System.out.println(Zoo.title);
		Zoo.info();
	}

}
