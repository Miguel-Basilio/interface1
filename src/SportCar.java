
public class SportCar extends Automibile {
	private double turbo=0;
	private double actualTurbo=0;
	
	public SportCar(int gearNumber, int year, String make, String color, String model) {
	
		super(gearNumber, year, make, color, model);
		this.turbo=turbo;
	}	
	

	@Override
	public void drive(int operatingCycle){
		setOperatingCycle(operatingCycle);
		if (getGear()<getGearNumber()){
			increaseGear();
			setCurrentSpeed(getGear()*10);
		}
		else if (getGear()==getGearNumber()){
			setCurrentSpeed((getGear()*10)*(1+turbo));
			turbo = turbo;
		}
		getMillage(getMillage()+ getCurrentSpeed()/60.0);
	}
@Override
public String toString(){
	double turboPercent = turbo*100;
	return String.format("%s, Turbo: %.0f%%",
			super.toString(),turboPercent);
}
	
		
		
		
		
		
	
	
}
