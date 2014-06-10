package chapter5.chocolate;

public class ChocolateBoiler {

	private static ChocolateBoiler  instance;
	
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler getInstance () {
		if ( instance == null ) {
			instance  =  new ChocolateBoiler();
		}
		return instance;
	}
	
	private ChocolateBoiler () {
		empty  =  true;
		boiled  =  true;
	}
	
	public void fill () {
		if ( empty ) {
			empty = false;
			boiled  =  false;
		}
	}
	
	public void drain () {
		if ( !empty && boiled ) {
			empty  =  true;
		}
	}
	
	public void boil () {
		if ( !empty && !boiled ) {
			boiled  =  true;
		}
	}
	
	public boolean isEmpty () {
		return empty;
	}
	
	public boolean isBoiled () {
		return boiled;
	}
}
