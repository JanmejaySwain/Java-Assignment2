/*Sum of product of consecutive odd digits of any digit number */
package assignment2;

import java.util.Scanner;

public class Expt1ix {
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
		  if(x%2!=0 && y%2!=0)
		  {
			  sum=sum+(x*y);
		  }
		  y=num%10;
		  num=num/10;
		  if(x%2!=0 && y%2!=0)
		  {
			  sum=sum+(x*y);
		  }
	  }
	  System.out.println("Sum of product of consecutive odd digits of "+temp+" is: "+sum);
}
}
