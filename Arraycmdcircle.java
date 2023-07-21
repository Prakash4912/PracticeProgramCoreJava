package test;

public class Arraycmdcircle {
public static void main(String[] args) {
	double r = Double.parseDouble(args[0]);
	double area= 3.14*r*r;
	double cir = 2*3.14*r;
	double dia = 2*r;
	
	System.out.println("area of circle is"+area);
	System.out.println("circumference of circle is"+cir);
	System.out.println("diameter of circle is"+dia);
	
}
}
