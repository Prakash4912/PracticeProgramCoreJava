package test;

public class Circlepara {
public void circle(double r)
{
	
	double cir_area= 3.14*r*r;
	double cir_circum = 2*3.14*r;
	double cir_dia = 2*r;
	System.out.println(r);
	System.out.println("area of circle is"+cir_area);
	System.out.println("circumference of circle is"+cir_circum);
	System.out.println("diameter of circle is"+cir_dia);
	
}
public static void main(String[] args) {
	Circlepara c = new Circlepara();
	c.circle(4.5);
}
}
