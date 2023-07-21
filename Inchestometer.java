package test;

public class Inchestometer {
	public void In(double inches)
	{
		//double meter = inches/39.37;
		double meter = inches*0.0254;
		System.out.println(inches);
		System.out.println("inches to meter is"+meter);
	}
	public static void main(String[] args) {
		Inchestometer i = new Inchestometer();
		i.In(40);
	}
	

}
