/*Sum of product of consecutive prime digits of any digit number */
package assignment2;

import java.util.Scanner;

public class Expt1x {
public static void main(String[] args) {
	int num,temp,x=0,sum=0,y = 0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  num=sc.nextInt();
	  temp=num;
	  while(num!=0)
	  {
		  x=num%10;
		  num=num/10;
		  if((x==2||x==3||x==5||x==7)&&(y==2||y==3||y==5||y==7))
		  {
			  sum=sum+(x*y);
		  }
		  y=num%10;
		  num=num/10;
		  if((x==2||x==3||x==5||x==7)&&(y==2||y==3||y==5||y==7))
		  {
			  sum=sum+(x*y);
		  }
	  }
	  System.out.println("Sum of product of consecutive prime digits of "+temp+" is: "+sum);
}
}
