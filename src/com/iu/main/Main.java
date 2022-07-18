package com.iu.main;

public class Main 
{
	public static void main(String[] args) 
	{
		int [] nums = {1,2,3};
		String name = "test";
		char ch = name.charAt(3);
		System.out.println(ch);
		
		//1. com.iu.utll.CollectionStack
			 //add - 새로운 숫자 추가 무조건 0번에 추가
			 //remove - 0번 인덱스 삭제
			 //collectionStack.add -> {4,1,2,3}
			 //collectionStack.remove -> {2,3}
		
		//2. com.iu.utll.CollectionQue
			 //add - 새로운 숫자 추가 무조건 0번에 추가
			 //remove - 마지막 인덱스 번호 삭제
		 	 //collectionStack.add -> {4,1,2,3}
		 	 //collectionStack.remove -> {1,2}
		
		//3. com.iu.utll.CollectionSet
			//add - 새로운 숫자 추가 무조건 마지막에 추가
			//		단, 중복되지 않는 숫자만 추가
			//remove - 삭제할 숫자를 입력받아서 일치하는 숫자 삭제
			//collectionStack.add -> {1,2,3,4}
	 	 	//collectionStack.remove -> {2,3}
	}
}
