package chapter3.starbuzz;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
		description  =  "Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15 + beverage.cost();
	}

}
