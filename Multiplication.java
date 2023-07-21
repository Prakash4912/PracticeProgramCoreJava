package test;
import java.util.Scanner;
public class Multiplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the input number");
		int num1=sc.nextInt();
		
		for (int i=0; i< 20; i++){
			   System.out.println(num1 + " x " + (i+1) + " = " + 
			     (num1 * (i+1)));
	}

}
}