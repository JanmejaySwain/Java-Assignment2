/*find number of prime numbers?*/
package assignment2;

public class Expt11c {
public static void main(String[] args) {
	int temp=0,count=0;
	System.out.println("No. Prime numbers  23 to 249 :");
	for(int i=23;i<=249;i++)
	{   temp=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				temp++;
			}
		}
		if(temp==2)
		{
			System.out.print(i+" ");
			count++;
		}
	}
	System.out.println("\nNo. of prime number between 23 and 249 is :"+count);

}
}
