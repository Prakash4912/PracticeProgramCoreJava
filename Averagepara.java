package test;

public class Averagepara {
	public void Avg(int a,int b,int c,int d,int e)
	{
		int avg = a+b+c+d+e/5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("average of number is "+avg);
	}
public static void main(String[] args) {
	Averagepara a = new Averagepara();
	a.Avg(22, 330, 30, 20, 40);
}
}
