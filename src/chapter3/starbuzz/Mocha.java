package chapter3.starbuzz;

public class Mocha extends CondimentDecorator {
	
	public Mocha (Beverage  beverage) {
		super(beverage);
		description  =  "Mocha";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}
