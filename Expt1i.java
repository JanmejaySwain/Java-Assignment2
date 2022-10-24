//Sum of all digits of any numbers
package assignment2;

import java.util.Scanner;

public class Expt1i {
public static void main(String[] args) {
	long num,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=sc.nextLong();
	long n=num;
	do
	{
		sum=sum+(n%10);
		n=n/10;
	}while(n>0);
	System.out.println("Sum of all digits of "+num+" is "+sum);
	
}

}
