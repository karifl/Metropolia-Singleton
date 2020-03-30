package singleton;

public class CocaFactory implements Drink {

	public CocaFactory() {
		
	}
	@Override
	public Cola getColaDrink() {
		// TODO Auto-generated method stub
		return new Coca();
	}

	@Override
	public Citrus getCitrusDrink() {
		// TODO Auto-generated method stub
		return new Sprite();
	}

}
