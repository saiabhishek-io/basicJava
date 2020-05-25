package com.company;

public class Main {

    public static void main(String[] args) {
/*	    byte b = 4;
	    short s = 10;
	    int a = 10;
	    long l = (long)(500000+ b + s+ a);
	    System.out.println(l);*/

/*		float div = (float) 5/3;
		System.out.println(div);
		double doub = (double) 5/3;
		System.out.println(doub);*/
//		double kg = 100D;
//		double pounds = (double) kg * 0.45359237;
//		System.out.println(pounds);
		char d = 'f';
		switch (d){
			case 'a':
				System.out.println("It was a");
				break;
			case 'b':
				System.out.println("It was B");
				break;
			default:
				System.out.println("It wasnt a, b,c it was " + (d));
				break;
		}

    }
}
