package test;
import java.util.Scanner;
public class LoopsIfelseLadder {
	public static void result()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks");
		Double marks = sc.nextDouble();

	if (marks<40)
	{
		System.out.println("u can fail");
	}
	else if((marks>40)&&(marks<75))
	{
		System.out.println("u are pass");
		
	}
	else
	{
		System.out.println("u are pass with distinction");
	}
}
	public static void main(String[] args) {
		result();
		result();
		result();
	}
}
