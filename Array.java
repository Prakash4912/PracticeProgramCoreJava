package test;

public class Array {
	public static void main(String[] args) {
		System.out.println("hello world ");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]+100);
		
		int a = Integer.parseInt(args[3]);
		int res = a+100;
		System.out.println(a);
		System.out.println(res);
	}

}
