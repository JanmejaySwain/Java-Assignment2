/*) find the sum of product of corresponding digits of 2nd largest even number and 
3rd smallest odd number?*/
package assignment2;

public class Expt11j {
public static void main(String[] args) {
	int count=0,temp=0,seEven=0,thOdd=0,sum=0,x=0,y=0;
	for(int i=23;i<=249;i++)
	{
		if(i%2!=0)
		{
			count++;
			if(count==3)
			{				
			thOdd=i;			
			}			
		}
	}
	for(int i=249;i>=23;i--)
	{
		if(i%2==0)
		{
			temp++;
			if(temp==2)
			{				
			seEven=i;			
			}			
		}
	}
	System.out.println("Second even number is : "+seEven);
	System.out.println("Third odd number is : "+thOdd);
	while(seEven!=0 || thOdd!=0)
	{
		x=seEven%10;
		y=thOdd%10;
		sum=sum+(x*y);
		seEven=seEven/10;
		thOdd=thOdd/10;
	}
	System.out.println("Sum of product of corresponding digits of 2nd largest even number and 3rd smallest odd number : "+sum);
}
}
