package chapter4.pizzastore;

public class CheesePizza extends Pizza{

	public CheesePizza(PizzaIngredientFactory factory) {
		super(factory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		dough  =  factory.createDough();
		sauce  =  factory.createSauce();
		cheese =  factory.createCheese();
	}

}
