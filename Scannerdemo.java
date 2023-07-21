package test;
import java.util.Scanner;

public class Scannerdemo {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter the name");
	String name = sc.nextLine();
	System.out.println("Eneter teh age");
	int age= sc.nextInt();
	System.out.println("Enter the Marks");
	Double marks = sc.nextDouble();
	System.out.println("name is"+name);
	System.out.println("age is"+age);
	System.out.println("marks is"+marks);
}

}
