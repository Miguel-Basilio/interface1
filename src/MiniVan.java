
public class MiniVan extends Automibile{

	public MiniVan(int gearNumber, int year, String make, String color, String model) {
		super(gearNumber, year, make, color, model);
	
	}
	@Override
	public void drive(int operatingCycle){
		setOperatingCycle(operatingCycle);
		if (getGear()<getGearNumber()){
			increaseGear();
			setCurrentSpeed(getGear()*10);		
		}
		getMillage(getMillage()+ getCurrentSpeed()/60.0);
}
}