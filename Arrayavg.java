package test;
import java.util.Scanner;
public class Arrayavg {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sales of the week..");
		int a=sc.nextInt();
		int s=0;
		for(int i=1;i<=7;i++)
		{
			s+=a;
		}
		float av=s/7.00f;
		System.out.println("total Sales :"+s);
		System.out.println("average Sales :"+av);
	}

}
