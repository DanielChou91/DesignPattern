package chapter4.pizzastore;

public abstract class PizzaStore {
	
	PizzaIngredientFactory	factory;
	
	public PizzaStore () {	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		String		pizzaType  =  pizza.getClass().getName();
		String		storeName  =  this.getClass().getName();
		System.out.println("order a " + pizzaType + " at " + storeName);
		return pizza;
	}

	protected Pizza createPizza(String item) {

		// TODO Auto-generated method stub
		if ( "cheese".equals(item)) {
			return  new CheesePizza(factory);
		} else  if ( "veggie".equals(item) ) {
			return new VeggiePizza(factory);
		} else if ( "clam".equals(item) ) {
			return new ClamPizza(factory);
		} else {
			
			return null;
		}
	
	}
	
}
