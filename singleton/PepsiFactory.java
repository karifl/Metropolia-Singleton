package singleton;

public class PepsiFactory implements Drink{

	public PepsiFactory() {
		
	}
	@Override
	public Cola getColaDrink() {
		// TODO Auto-generated method stub
		return new Pepsi();
	}

	@Override
	public Citrus getCitrusDrink() {
		// TODO Auto-generated method stub
		return new SevenUp();
	}

}
