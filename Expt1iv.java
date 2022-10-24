//Sum of all prime digits
package assignment2;

import java.util.Scanner;

public class Expt1iv {
public static void main(String[] args) {
	long num,sum=0,x,y,temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=sc.nextLong();
	x=num;
	while(x>0)
	{
		y=x%10;
		
		for(int i=1;i<=y;i++)
		{
			if(y%i==0)
			{
				temp++;
			}
		}
		
		if(temp==2)
		{
			sum=sum+y;
			x=x/10;
		}else
		{
			x=x/10;
		}
		temp=0;
	}
	
	System.out.println("Sum of all prime digits of "+num+" is : "+sum);
}
}
