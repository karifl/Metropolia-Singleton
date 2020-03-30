package singleton;

public class Brewer {
	public static void main(String[] args) {
		//DrinkFactory pepsi = DrinkFactory.getInstance(new PepsiFactory());
		DrinkFactory coca = DrinkFactory.getInstance(new CocaFactory());
		//pepsi.listDrinks();
		coca.listDrinks();
	}
}
