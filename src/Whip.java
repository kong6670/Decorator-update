
public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage  = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Whip";
	}
	public double cost(){
		return 0.10 + beverage.cost();
	}
}
