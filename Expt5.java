package assignment2;

import java.util.Scanner;

public class Expt5 {
public static void main(String[] args) {
	int num,x=0,n=0,temp=0;
	double r=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	num=sc.nextInt();
	temp=num;
	while(temp!=0)
	{
		int flag=0;
		flag=temp%10;
		if(flag%2==0 && flag!=2 && flag!=8)
		{
			x=x+flag;
		}else {
			if(flag!=1 && flag!=3)
			{
				n=n+flag;
			}		
		}
		temp=temp/10;
	}
	
	for(int i=1;i<=n;i++)
	{
		int j=(2*1)-1;
		int fj=1;
		for(int k=1;k<=j;k++)
		{
			fj=fj*k;
		}
		r=r+(Math.pow(-1,(i+1))*(Math.pow(x,j))/fj);
	}
	System.out.println("R="+r);
}
}
