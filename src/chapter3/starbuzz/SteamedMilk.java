package chapter3.starbuzz;

public class SteamedMilk extends CondimentDecorator {

	
	public SteamedMilk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
		description  =  "Steamed Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}
	
}
