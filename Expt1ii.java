package assignment2;

import java.util.Scanner;

public class Expt1ii {
public static void main(String[] args) {
	long num,sum=0,temp1,temp2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=sc.nextLong();
	temp1=num;
	while(temp1>0)
	{
		temp2=temp1%10;
		if(temp2%2==0)
		{
			sum=sum+temp2;
			temp1=temp1/10;
		}else
		{
			temp1=temp1/10;
		}		
	}
	
	System.out.println("Sum of even digits of "+num+" is : "+sum);
}
}
