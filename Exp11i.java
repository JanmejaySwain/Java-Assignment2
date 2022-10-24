/*) find first five largest even number and smallest odd number? */
package assignment2;

public class Exp11i {
public static void main(String[] args) {
	int count=0,temp=0;
	System.out.println("First 5 Smallest odd number between 23 to 249 :");
	for(int i=23;i<=249;i++)
	{
		if(i%2!=0)
		{
			count++;
			if(count<=5)
			{
				
			System.out.print(i+" ");
			
			}
			
		}
	}
	System.out.println("\nLast 5 Largest even number between 23 to 249 :");
	for(int i=249;i>=23;i--)
	{
		if(i%2==0)
		{
			temp++;
			if(temp<=5)
			{
				
			System.out.print(i+" ");
			
			}
			
		}
	}
}
}
