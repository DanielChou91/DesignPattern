package chapter4.pizzastore;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public String createDough() {
		// TODO Auto-generated method stub
		return "NY dough";
	}

	@Override
	public String createSauce() {
		// TODO Auto-generated method stub
		return "Hot Sauce";
	}

	@Override
	public String createCheese() {
		// TODO Auto-generated method stub
		return "American Cheese";
	}

}
