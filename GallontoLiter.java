/*
*
* GallontoLiter.java
* Author: William Russell
*/
import java.util.Scanner;

public class GallontoLiter {

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a gallon number: ");	
	double gallons;
	gallons=sc.nextDouble();
	double liters;
	liters=3.7854*gallons;	
	

		System.out.println("Number of Liters is: " + liters);
	}
	
}
