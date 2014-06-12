package chapter4.pizzastore;

public class PizzaTestDrive {

	public static void main (String... args)  {
		PizzaStore		nyStore  =  new NYPizzaStore();
		
		Pizza	pizza  =  nyStore.orderPizza("cheese");
	}
}
