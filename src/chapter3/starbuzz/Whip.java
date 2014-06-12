package chapter3.starbuzz;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
		description  =  "Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}

}
