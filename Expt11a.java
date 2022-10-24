/*find number of even numbers that ends with 0 or 4 between 23 to 249?*/
package assignment2;

public class Expt11a {
public static void main(String[] args) {
	System.out.println("Even numbers that ends with 0 and 4 between 23 to 249 :");
	for(int i=23;i<=249;i++)
	{
		if(i%2==0 && (i%10==0 || i%10==4))
		{
			System.out.print(i+" ");
		}
	}
}
}
