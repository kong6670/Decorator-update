import java.text.NumberFormat;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage b1 = new Espresso();
		NumberFormat numFormat = NumberFormat.getInstance();
		String price = numFormat.format(b1.cost());
		System.out.println(b1.getDescription()+" $"+price);
		
		
		
		Beverage b2 = new HouseBlend();
		b2 = new Mocha(b2);
		b2 = new Whip(b2);
		String price2 = numFormat.format(b2.cost());
		System.out.println(b2.getDescription()+" $"+price2);

		
		Beverage b3 = new Decaf();
		b3 = new SteamedMilk(b3);
		b3 = new Soy(b3);
		b3 = new Whip(b3);
		String price3 = numFormat.format(b3.cost());
		System.out.println(b3.getDescription()+" $"+price3);
		
		Beverage b4 = new DarkRoast();
		b4 = new Mocha(b4);
		b4 = new Soy(b4);
		String price4 = numFormat.format(b4.cost());
		System.out.println(b4.getDescription()+" $"+price4);
		
	}

}
