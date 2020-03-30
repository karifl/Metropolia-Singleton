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


	private void setName(Drink name) {
		this.name = name;
	}
	
	public synchronized DrinkFactory getInstance() {
		

			System.out.println("In this country we only serve: ");
			System.out.println(this.name.getColaDrink());
			System.out.println(this.name.getCitrusDrink());
		
			return INSTANCE;
		}

	}

