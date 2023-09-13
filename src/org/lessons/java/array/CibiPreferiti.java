package org.lessons.java.array;


import java.util.Arrays;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] favoriteFoods = {"Pizza", "Pasta", "Hamburger", "Sushi", "Bistecca", "Patatine Fritte"};
		
		System.out.println("Your have " + favoriteFoods.length + " favorite foods");
		System.out.println("Your favorite food is " + favoriteFoods[0]);
		System.out.println("Your less favorite food is " + favoriteFoods[favoriteFoods.length - 1]);
		
		//even scenario
		if(favoriteFoods.length %2 == 0) {
			//select the foods with the index == to half of favoriteFoods.lenght and = to half of favoriteFood.lenght - 1
			String[] middleRankFoodsEven = {favoriteFoods[(favoriteFoods.length / 2) - 1], favoriteFoods[favoriteFoods.length / 2]};
			System.out.println("Your average favorite food are " + Arrays.toString(middleRankFoodsEven));
		//odd scenario
		} else {
			//select the food with the index == to half of the favoriteFood.lenght rounded up 
			String middleRankFoodOdd = favoriteFoods[favoriteFoods.length / 2];
			System.out.println(favoriteFoods.length / 2);
			System.out.println("Your average favorite food is " + middleRankFoodOdd);
		}
	}
}
