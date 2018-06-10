package 建造着模式;

public class BuilderPatternDemo {
	public static void main(String[] args){
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost:"+vegMeal.getCost());
		
		Meal noVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		noVegMeal.showItems();
		System.out.println("Total Cost:"+noVegMeal.getCost());
	}
}
