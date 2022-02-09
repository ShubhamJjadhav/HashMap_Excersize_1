package com.capgemini.sfdc.col;

import java.util.HashMap;

public class HashMap_Exerc_1 
{
	
	public static void main(String[] args)
	{
	
		HashMap<String, Integer > map = new HashMap<>();
		
		map.put("Tokyo", 10);
		map.put("Berlin", 30);
		map.put("Professor", 20);

		
		System.out.println("Size of map is:- "+ map.size());

		System.out.println( map );

	}

}
