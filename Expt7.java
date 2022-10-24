/*Write a java program to find factorial of a number using while loop, do while loop 
and for loop all in one program?[hint use switch block]? */
package assignment2;

import java.util.Scanner;

public class Expt7 {
public static void main(String[] args) {
	int i,fact=1,num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=sc.nextInt();
	System.out.println("Enter your choice:");
	i=sc.nextInt();
	switch(i)
	{
	case 1:
		if(num>0)
		{
			while(num>0)
		{
			fact=fact*num;
			num--;
		}
			System.out.println("Factorial is :"+fact);
		}else
		{
			System.out.println("Enter +ve integer only...");
		}
		break;
	case 2:
		if(num>0)
		{
			do {
			fact=fact*num;
			num--;
		}while(num>0);
			System.out.println("Factorial is :"+fact);
		}else
		{
			System.out.println("Enter +ve integer only...");
		}		
	   break;
	   
	case 3:
		if(num>0)
		{
		for(int j=1;j<=num;j++)
		{
			fact=fact*j;
		}
		System.out.println("Factorial is :"+fact);
		}else
		{
			System.out.println("Enter +ve integer only...");
		}		
		break;
		
	default:
		System.out.println("Invalid Input...");
	}
}
}
