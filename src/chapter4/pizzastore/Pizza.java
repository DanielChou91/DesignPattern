package chapter4.pizzastore;

import java.util.ArrayList;

public abstract class Pizza {
	String		name;
	String		dough;
	String		sauce;
	String		cheese;
	ArrayList<String>	toppings  =  new ArrayList<>();
	
	PizzaIngredientFactory	factory;
	
	public Pizza (PizzaIngredientFactory factory) {
		this.factory  =  factory;
	}
	
	protected abstract void prepare();
	
	void bake () {
		System.out.println("Bake for 25 minutes at 350.");
	}
	
	void cut () {
		System.out.println("Cutting the pizza into diagonal slices.");
	}
	
	void box () {
		System.out.println("Place pizza in official PizzaStore box.");
	}
	
	public String getName () {
		return name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + "]";
	}
	
}
