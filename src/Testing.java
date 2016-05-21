import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Automibile[] automobile = new Automibile[3];


automobile[0]=  new Truck (4,1987, "Toyota", "White", "Corolla");
automobile[1]= new SportCar (8,2017, "Heennessy","Gray","Venom");
automobile[2]= new MiniVan (6,2000, "Chevrolet","Blue","Venture");

System.out.println("\nThis are your new Cars: " +automobile[0]+automobile[1]+automobile[2]);

System.out.println("Enter Number of Operating Cycles: ");
int operatingCycle = Dice.Trhow(in.nextInt());
System.out.println("Operating Cycles = "+ operatingCycle);
System.out.println("Press 1 to TestDrive Your new Car");
int testDrive = in.nextInt();

for (int i=1; i <=operatingCycle; i ++){
	
	automobile[0].drive(i);
			automobile[1].drive(i);
					automobile[2].drive(i);
System.out.println(automobile[0]);
System.out.println(automobile[1]);
System.out.println(automobile[2]);


}

		

	}

}
