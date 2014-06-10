package chapter4.pizzastore;

public class ClamPizza extends Pizza{

	public ClamPizza(PizzaIngredientFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		dough  =  factory.createDough();
		cheese =  factory.createCheese();
	}

}
