package test;

public class Sipara {
	public void simple(int P,int R,int T)
	{
		int SI = P*R*T/100;
		System.out.println(P);
		System.out.println(R);
		System.out.println(T);
		System.out.println("simple interest is "+SI);
	}
 public static void main(String[] args) {
	Sipara s = new Sipara();
	s.simple(23, 330, 30);
}
}
