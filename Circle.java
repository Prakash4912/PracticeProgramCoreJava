package test;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		/*double r = 2.3;
            		    double cir = 2*3.14*r;
		double area=3.14*r*r;
		System.out.println("Diameter is "+dia);
		System.out.println("circumference is"+cir);
		System.out.println("area is"+area);
	}

}*/
		
		
		Scanner sc = new Scanner(System.in);
		Double r,diameter,circum,area;
		System.out.println("enter the radius of circle ");
		r =sc.nextDouble();
		 diameter = 2*r;
		 circum = 2*3.14*r;
		 area=3.14*r*r;
		System.out.println("Diameter is "+diameter);
		System.out.println("circumference is"+circum);
		System.out.println("area is"+area);
	}

}


