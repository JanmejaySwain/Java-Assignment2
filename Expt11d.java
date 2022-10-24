//find number of palindrome numbers between 23 and 249 ?
package assignment2;

public class Expt11d {
public static void main(String[] args) {
	int rev=0,count=0;
	System.out.println("palindrome numbers that between 23 to 249 :");
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
			System.out.print(i+" ");
			count++;
		}
	}
	System.out.println("\nNo. of palindrome numbers that between 23 to 249 is : "+count);
}
}
