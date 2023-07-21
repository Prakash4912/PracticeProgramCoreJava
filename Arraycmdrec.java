package test;

public class Arraycmdrec {
	public static void main(String[] args) {
		double length= Double.parseDouble(args[0]);
		double breadth = Double.parseDouble(args[0]);

		 double Area = length * breadth;
		 double peri = 2*length+breadth;
		  
		
			System.out.println("Area of Reactangle is "+Area);
			System.out.println("Perimeter of Rectangle is"+peri);

}
}
