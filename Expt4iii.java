package assignment2;

import java.util.Scanner;

public class Expt4iii {
public static void main(String[] args) {
	int x,n;
	double r=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x :");
	x=sc.nextInt();
	System.out.println("Enter the value of n :");
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			int j=i;
			int fj=1;
			for(int k=1;k<=j;k++)
			{
				fj=fj*k;
			}
			r=r+Math.pow(x, j)/fj;
		}
	}
	System.out.println("R="+r);
}
}
