	package test;
import java.util.Scanner;
public class ArraybyScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number u added");
		int num =sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("enter"+i+"element");
			arr[i]=sc.nextInt();
		}
		for(int t:arr)
		{
			System.out.print(t+" ");
		}
	}

}
