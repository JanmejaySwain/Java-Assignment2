//Difference between average of all even digits except divisible by 4
// and average of all odd digits except divisible by 3
package assignment2;

import java.util.Scanner;

public class Expt1v {
public static void main(String[] args) {
	long num,se=0,so=0,x,y,ne=0,no=0;
	float eavg,oavg,dif;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=sc.nextLong();
	x=num;
	while(x>0)
	{
		y=x%10;
		if(y%2==0)
		{
			if(y%4!=0)
			{
				se=se+y;
				ne++;
				x=x/10;
				
			}else
			{
				x=x/10;
			}
			
		}else
		{
			if(y%3!=0)
			{
				so=so+y;
				no++;
				x=x/10;
				
			}else
			{
				x=x/10;
			}
		}
	}
	
	eavg=(float)se/ne;
	oavg=(float)so/no;
	dif=eavg-oavg;
	System.out.println("Average of sum of all even digits of "+num+" is : "+eavg);
	System.out.println("Average of sum of all odd digits of "+num+" is : "+oavg);
	System.out.println("Difference between two averages : "+dif);
}
}
