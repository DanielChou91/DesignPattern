package chapter4.pizzastore;

public class NYPizzaStore extends PizzaStore {

	
	public NYPizzaStore() {
		super();
		// TODO Auto-generated constructor stub
		factory  =  new NYPizzaIngredientFactory();
	}

}
