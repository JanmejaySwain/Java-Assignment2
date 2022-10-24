
package assignment2;


import java.util.Scanner;

public class Expt4i {
public static void main(String[] args) {
	int x,n,esum=0,osum=0,fact=1,epower=1,opower=1;
	float result;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x:");
	x=sc.nextInt();
	System.out.println("Enter the value of n :");
	n=sc.nextInt();
	for(int i=2;i<=n;i++)
	{
		int j=i;
		if(j%2==0)
		{
			while(j>0)
			{
				fact=fact*j;
				epower=epower*x;
				j--;
			}
			
			
			esum=(esum+(epower/fact));
			epower=1;
			fact=1;
		}else
		{
			while(j>0)
			{
				fact=fact*j;
				opower=opower*x;
				j--;
			}
			osum= (osum+(opower/fact));
			opower=1;
			fact=1;
		}
	}
	result=1+osum-esum;
	System.out.println("R="+result);
	
}
}
