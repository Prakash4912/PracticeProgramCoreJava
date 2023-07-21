package test;
import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
	/* double length = 3.4;
	 double breadth = 6.7;
	 double Area = length * breadth;
	 double peri = 2*length+breadth;
	  
	
		System.out.println("Area of Reactangle is "+Area);
		System.out.println("Perimeter of Rectangle is"+peri);
	}

}*/

Scanner sc = new Scanner(System.in);
int length,breadth,Area,Perimeter;
System.out.println("Enter the value of length of rectangle ");
length = sc.nextInt();
System.out.println("Enter the value of breadth of rectangle");
breadth = sc.nextInt();
Area = length*breadth;
Perimeter =2*length+breadth;
System.out.println("area of rectangle is "+Area);
System.out.println("perimeter of rectangle is"+Perimeter);
	}
}
