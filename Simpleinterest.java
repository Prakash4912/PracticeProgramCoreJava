package test;
import java.util.Scanner;
public class Simpleinterest {
	public static void main(String[] args) {
	/*	int P = 30;
		           //Principle Amount
		
		int R = 20; //Rate
		
		int T = 11; //Time
		int SI = P*R*T/100;
		
		System.out.println("Simple interest"+SI);
	}

}*/
		Scanner sc = new Scanner(System.in);
		int P,R,T;
		System.out.println("enter value p");
		P=sc.nextInt();
		System.out.println("enter value of r");
		R=sc.nextInt();
		System.out.println("enter value of t");
		T=sc.nextInt();
		int SI = P*R*T/100;
		System.out.println("SI is "+SI);
	}
}
