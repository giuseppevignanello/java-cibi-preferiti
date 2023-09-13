package org.lessons.java.array;


import java.util.Arrays;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] favoriteFoods = {"Pizza", "Pasta", "Hamburger", "Sushi", "Bistecca", "Patatine Fritte", "Prova"};
		
		System.out.println("Your have " + favoriteFoods.length + " favorite foods");
		System.out.println("Your favorite food is " + favoriteFoods[0]);
		System.out.println("Your less favorite food is " + favoriteFoods[favoriteFoods.length - 1]);
		
		String middleRankFood = favoriteFoods[favoriteFoods.length / 2];
		
		//even scenario
		if(favoriteFoods.length %2 == 0) {
			String anotherMiddleRankFood = favoriteFoods[(favoriteFoods.length / 2) - 1];
			System.out.println("Your average favorite food are " + anotherMiddleRankFood + " and " + middleRankFood);
		//odd scenario
		} else {
			
			System.out.println("Your average favorite food is " + middleRankFood);
		}
	}
}
