package test;

public class Sad {
	int a= 23;
	public int add()
	{
		return a;
	}
	public String display()
	{
		return "Hi";
	}
	public static void main(String[] args) {
		Sad s = new Sad();
		System.out.println(s.add());
		//System.out.println(s.display());
		int res = s.add();
		String str =s.display();
		System.out.println(str);
	}
}
