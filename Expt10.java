/*Write a program to generate Fibonacci series up to n terms? Value of n will be 
accepted from user?*/
package assignment2;

import java.util.Scanner;

public class Expt10 {
public static void main(String[] args) {
	int n,a=0,b=1,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the term(value of n where n>1):");
	n=sc.nextInt();
	if(n>1)
	{
	System.out.println("Fibonacci series up to "+n+"th term is : ");
	System.out.print(a);
	System.out.print(" "+b);
	for(int i=2;i<n;i++)
	{
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
	}else
	{
		System.out.println("Please enter the value of n >1....");
	}
	
}
}
