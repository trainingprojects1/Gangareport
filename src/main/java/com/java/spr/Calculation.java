package main.java.com.java.spr;

public class Calculation {
	
	public void calc(int a,int b) {
	int c=a+b;
	System.out.println("Sum is " +c);
	}
	public static void main(String[] args) {
		int a=5, b=7;
		Calculation obj = new Calculation();
		obj.calc(a, b);
		
		
		
	}

}
 