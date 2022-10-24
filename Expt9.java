/*Write a program to find factorial of difference between greatest and smallest 
number among 3 numbers?
*/
package assignment2;

import java.util.Scanner;

public class Expt9 {
public static void main(String[] args) {
	int a,b,c,fact=1,dif,greatest=0,smallest=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 number:");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			greatest=a;
		}else
		{
			greatest=c;
		}
	}else
	{
		if(b>c)
		{
			greatest=b;
		}else
		{
			greatest=c;
		}
	}
	
	if(a<b)
	{
		if(a<c)
		{
			smallest=a;
		}else
		{
			smallest=c;
		}
	}else
	{
		if(b<c)
		{
			smallest=b;
		}else
		{
			smallest=c;
		}
	}
	
	System.out.println("Greatest number is:"+greatest);
	System.out.println("Smallest number is:"+smallest);
	dif=greatest-smallest;
	int temp=dif;
	System.out.println("Difference between Greatest and Smallest is:"+dif);
	
	while(dif>0)
	{
		fact=fact*dif;
		dif--;
	}
	System.out.println("Factorial of "+temp+" is: "+fact);
}
}
