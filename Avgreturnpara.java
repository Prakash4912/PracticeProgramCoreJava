package test;

public class Avgreturnpara {
	public static double cal_avg(int a,int b,int c)
	{
		double avg = (a+b+c)/3;
		return avg;
	}
	public static void main(String[] args) {
		Avgreturnpara a = new Avgreturnpara();
		System.out.println("average is"+a.cal_avg(22, 330, 30));
	}

}
