package com.java.examples;

import java.util.Hashtable;
/*
 * Question: Find the first recurring character from a given String
 * 
 * Example: 
 * Input : "ABCDEA" --> output "A"
 * Input : "ABCDBA" --> output "B"
 * Input : "ABCABEA" --> output "A"
 * Input : "ABC" --> output Null
 */
import java.util.Map;

public class FirstCharacterOccurance {
	
	public final String EMPTY_STRING = "";
	
	public String firstRepeatedCharInAString(String inputString){
		if(inputString == null || inputString.isEmpty() || inputString.length() == 1 ){
			return EMPTY_STRING;
		}else{
			String[] charactersInTheString = inputString.split("");
		    Map<String,Integer> mapOfCharactersFromTheString = new Hashtable<>();
			for(String characterString : charactersInTheString){
				if(mapOfCharactersFromTheString.containsKey(characterString))
					return characterString;
				else
					mapOfCharactersFromTheString.put(characterString, 1);
			}
			return EMPTY_STRING;
		}
	}

	public String toString(){
		return "This class returns first repeated character in the given input string";
	}
}
