/*Write a java program to check weather the given number is palindrome and 
prime or not */
package assignment2;

import java.util.Scanner;

public class Expt6 {
public static void main(String[] args) {
	int num,rev=0,x=0,temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	num=sc.nextInt();
	temp=num;
	while(temp!=0)
	{
		
		rev=(rev*10)+(temp%10);
		temp=temp/10;
	}
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			x++;
		}
	}
	if((num==rev)&&(x==2))
	{
		System.out.println(num+" is a palindrome and prime number");
	}else
	{
		System.out.println(num+" is not a palindrome and prime number");
	}
	
}
}
