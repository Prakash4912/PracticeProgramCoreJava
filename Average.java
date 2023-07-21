package test;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		/*int A = 4546;
		int B = 334545;
		int C = 65545;
		int D = 54567;
		int Avg = A+B+C+D/4;
		System.out.println("Avearge of Four No. is "+Avg);
	} 

}*/
		Scanner sc = new Scanner(System.in);
		int A,B,D,C;
		System.out.println("enter the value of a");
		A=sc.nextInt();
		System.out.println("enter the value of b");
		B=sc.nextInt();
		System.out.println("enter the value of c");
		C=sc.nextInt();
		System.out.println("enter the value of d");
		D=sc.nextInt();
		int Avg = A+B+C+D/4;
		System.out.println("Average is "+Avg);
}
}
