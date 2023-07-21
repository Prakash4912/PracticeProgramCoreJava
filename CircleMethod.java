package test;

public class CircleMethod {
	
	public void cir_area()
	{
	double r = 3.4;
	double cir_area=3.14*r*r;
	System.out.println("area of circle is "+cir_area);
	
		
	}
	
	public void cir_dia()
	{
		double r = 4.5;
		double dia = 2*r;
		System.out.println("Diameter of circle is"+dia);
	}
	
	public void cir_circum()
	{
	double r = 2.3;
	double circum = 2*3.14*r;
	System.out.println("circumference of circle is "+circum);
	}
	public static void main(String[] args) {
		CircleMethod cm = new CircleMethod();
		cm.cir_area();
		cm.cir_dia();
		cm.cir_circum();
	}
	

}
