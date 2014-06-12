package chapter5.chocolate;

public class ChocolateBoiler {

	private static volatile ChocolateBoiler  instance;
	
	private boolean empty;
	private boolean boiled;
	
	/* Double check to solve potential problem in multithread programming. */
	public ChocolateBoiler getInstance () {
		if ( instance == null ) {
			synchronized ( ChocolateBoiler.class ) {
				if ( instance == null ) {
					instance  =  new ChocolateBoiler();
				}
			}
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
