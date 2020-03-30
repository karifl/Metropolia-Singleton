package singleton;

public class Brewer {
	public static void main(String[] args) {
		DrinkFactory pepsi = DrinkFactory.getInstance(new PepsiFactory());
		pepsi.getInstance();
		
		DrinkFactory coca = DrinkFactory.getInstance(new CocaFactory());
		coca.getInstance();
	}
}
