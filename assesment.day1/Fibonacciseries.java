package week1.assesment;

import java.util.Iterator;

public class Fibonacciseries {
	public static void main(String[] args) {
		int a=0,b=1,c,n=8;
		System.out.println("a");
		System.out.println("b");
		for (int i=0;i<n; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(" Fibonacci series :" +c);
		}
		
	}

}
