package test;
import java.util.Scanner;

public class ScannerStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter the marks 5 subjects out of 100");
		System.out.println("enter the student name ");
		String name = sc.nextLine();
        System.out.println("enter the student add");
		String add=sc.nextLine();
		System.out.println("Enter the student roll no");
		int rollno = sc.nextInt();
		
		

		System.out.println("enter the marks 5 subjects out of 100");
		 int m1 = sc.nextInt();
		 int m2 = sc.nextInt();
		 int m3 = sc.nextInt();
		 int m4 = sc.nextInt();
		 int m5 = sc.nextInt();
		 int total=m1+m2+m3+m4+m5;
		 double per=(total*100)/500;
		
		System.out.println("student name is "+name);
		System.out.println("sthdent roll no is"+rollno);
		System.out.println("student address is "+add);
		System.out.println("Toal marks is "+total);
		System.out.println("Percentage is "+per);
		
		
		
	}

}
