/*find difference between average of palindrome and prime numbers? */
package assignment2;

public class Expt11e {
public static void main(String[] args) {
	int temp1=0,count1=0,rev=0,count=0,sum1=0,sum2=0;
	float prmAvg,palAvg;
	System.out.println("No. Prime numbers  23 to 249 :");
	for(int i=23;i<=249;i++)
	{   temp1=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				temp1++;
			}
		}
		if(temp1==2)
		{
			sum1=sum1+i;
			System.out.print(i+" ");
			count1++;
		}
	}
	prmAvg=sum1/count1;
	
	System.out.println("\npalindrome numbers that between 23 to 249 :");
	for(int i=23;i<=249;i++)
	{   rev=0;
	    int j=i;
		while(j!=0)
		{
			rev=rev*10+(j%10);
			j=j/10;
		}
		if(i==rev)
		{
			sum2=sum2+i;
			System.out.print(i+" ");
			count++;
		}
	}
	palAvg=sum2/count;
	System.out.println("\nSum of all prime number :"+sum1);
	System.out.println("Average of all prime number :"+prmAvg);
	System.out.println("Sum of all palindrome number: "+sum2);
	System.out.println("Average of all palindrome number : "+palAvg);
	System.out.println("Difference between average of palindrome and prime numbers: "+(palAvg-prmAvg));
}
}
