package test;

public class Volumeboxpara {
	public void Volume(int l,int h,int b)
	{
		int volume = l*b*h;
		System.out.println(l);
		System.out.println(h);
		System.out.println(b);
		System.out.println("volume of box is"+volume);
	}
	public static void main(String[] args) {
		Volumeboxpara v = new Volumeboxpara();
		v.Volume(22, 33, 5);
	}

}
