/*Write a java program to find sum of product of corresponding even digits of 
first any digit number and corresponding odd digit of any digit number Such 
as n=1234 m=4567 output=4*7+2*5
*/
package assignment2;

import java.util.Scanner;

public class Expt3 {
public static void main(String[] args) {
	int num1,num2,temp1,temp2,x=0,y=0,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	num1=sc.nextInt();
	System.out.println("Enter another number :");
	num2=sc.nextInt();
	while(num1!=0 || num2!=0)
	{
		x=num1%10;
		y=num2%10;
		if(x%2==0 && y%2!=0)
		sum=sum+(x*y);
		num1=num1/10;
		num2=num2/10;
	}
	System.out.println(sum);
}
}
