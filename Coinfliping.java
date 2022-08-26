package com.basicprograms;

import java.util.Scanner;

public class Coinfliping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to flip coin");
		int numberOfTime = scanner.nextInt();
		int tail=0;
		int head=0;
		 if(numberOfTime > 0) {
			 for(int i=0; i<numberOfTime;i++) {
				 double value = Math.random();
				 if(value<0.5) {
					 tail++;
				 }
				 else {
					 head++;
					 
				 }
			 }
	       double percentageOfhead=(head*100/numberOfTime);
	       double percentageOftail=(tail*100/numberOfTime);
	       scanner.close();
	       System.out.println("total head count" +head);
           System.out.println("total tail count" +tail);
           System.out.println("Percentage of head" +percentageOfhead);
           System.out.println("Percentage of tail" +percentageOftail);
		 }System.out.println("enter the positive number");

	}

}
