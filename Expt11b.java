/* find number of odd numbers that ends with 5 or 7 between 23 to 249??
*/
package assignment2;

public class Expt11b {
public static void main(String[] args) {
	System.out.println("Odd numbers that ends with 5 and 7 between 23 to 249 :");
	for(int i=23;i<=249;i++)
	{
		if(i%2!=0 && (i%10==5 || i%10==7))
		{
			System.out.print(i+" ");
		}
	}
}
}
