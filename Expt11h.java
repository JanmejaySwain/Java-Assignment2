/*Check whether the difference between largest even number and smallest odd 
number is palindrome or not between 23 to 249?*/
package assignment2;

public class Expt11h {
public static void main(String[] args) {
	int count=0,temp=0,so=0,le=0,dif=0,rev=0;
	System.out.println("Smallest odd number between 23 to 249 :");
	for(int i=23;i<=249;i++)
	{
		if(i%2!=0)
		{
			count++;
			if(count==1)
			{
				so=i;
			System.out.println(i+" ");
			
			}
			
		}
	}
	System.out.println("Largest even number between 23 to 249 :");
	for(int i=249;i>=23;i--)
	{
		if(i%2==0)
		{
			temp++;
			if(temp==1)
			{
				le=i;
			System.out.println(i+" ");
			
			}
			
		}
	}
	dif=le-so;
	System.out.println("Difference between largest even and smallest odd is : "+dif);
	int temp1=dif;
	while(temp1!=0)
	{
		rev=rev*10+(temp1%10);
		temp1=temp1/10;
	}
	if(dif==rev)
	{
		System.out.println("Difference between largest even number and smallest odd number is palindrome....");
	}else
	{
		System.out.println("Difference between largest even number and smallest odd number is not palindrome....");

	}
}
}
