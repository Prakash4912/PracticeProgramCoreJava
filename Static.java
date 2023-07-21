package test;

public class Static {
	public static void add()
	{
		System.out.println("add method ");
	}
	public static void multi(int a ,int b)
	{
			System.out.println(a*b);
	}
	public static void main(String[] args) {
		add();
		multi(11,11);
	}
}
