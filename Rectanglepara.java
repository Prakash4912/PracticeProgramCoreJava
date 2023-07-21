package test;

public class Rectanglepara {
public void Rec(int l,int b)
{
	int area = l*b;
	int peri = 2*l+b;
	System.out.println(l);
	System.out.println(b);
	System.out.println("area of rectangle is "+area );
	System.out.println("perimeter of rectangle is"+peri);
	
}
public static void main(String[] args) {
	Rectanglepara r = new Rectanglepara();
	r.Rec(33, 77);
}
}
