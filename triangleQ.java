package test;
import java . util.Scanner;
public class triangleQ 
	{
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System .in);
		double length,breadth;
		System.out.println("enter the length of rectangle");
		 length = sc.nextDouble();
		 System.out.println("enter the breadth of rectangle");
		 breadth = sc.nextDouble();
		
		if(length ==  breadth)
		{
			System.out.println("it's a square");
		}
		else
		{
			System.out.println("it a rectangle");
		}
	}

}


































