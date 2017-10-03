
public class SteamedMilk extends CondimentDecorator {
	Beverage beverage;
	
	public SteamedMilk(Beverage beverage){
		this.beverage  = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",SteamedMilk";
	}
	public double cost(){
		return 0.10 + beverage.cost();
	}

}
