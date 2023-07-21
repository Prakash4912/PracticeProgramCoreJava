package test;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
	/*int height = 34;
    int breadth = 24;
   int Area = height*breadth/2;
   System.out.println("area of triangle is "+Area);
	}

}*/



Scanner sc = new Scanner (System.in);
int height,breadth,Area;
System.out.println("enter height of triangle");
height = sc.nextInt();
System.out.println("enter breadth of triangle");
breadth = sc.nextInt();
Area = height*breadth/2;
System.out.println("Area of triangle is"+Area);
	}
}

