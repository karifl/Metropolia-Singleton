package singleton;



public class DrinkFactory {
	
	private static DrinkFactory INSTANCE = null;
	private Drink name;
	private DrinkFactory(Drink name) {
		System.out.println("DrinkFactory ready to brew.");
		this.setName(name);
	}
	
	public static synchronized DrinkFactory getInstance(Drink name) {
		if (INSTANCE == null) {
			INSTANCE = new DrinkFactory(name);
		}
		return INSTANCE;
	}

	public void setName(Drink name) {
		this.name = name;
	}
	
	
	void listDrinks() {
		System.out.println("In this country we only serve: ");
		System.out.println(name.getColaDrink());
		System.out.println(name.getCitrusDrink());
		
	}

}
