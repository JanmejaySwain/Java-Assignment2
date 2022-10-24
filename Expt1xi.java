/*Difference between Sum of product of consecutive even digits 
except 2 and 6 and Sum of product of consecutive odd digits 
except 3 and 7 of any digit number */
package assignment2;

import java.util.Scanner;

public class Expt1xi {
public static void main(String[] args) {
	int num,temp,x=0,esum=0,osum=0,y = 0,dif;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  num=sc.nextInt();
	  temp=num;
	  while(num!=0)
	  {
		  x=num%10;
		  num=num/10;
		  if(x%2==0 && y%2==0&&x!=2&&y!=6&&x!=6&&y!=2)
		  {
			  esum=esum+(x*y);
		  }
		  if(x%2!=0 && y%2!=0&&x!=3&&y!=3&&x!=7&&y!=7)
		  {
			  osum=osum+(x*y);
		  }
		  y=num%10;
		  num=num/10;
		  if(x%2==0 && y%2==0&&x!=2&&y!=6&&x!=6&&y!=2)
		  {
			  esum=esum+(x*y);
		  }
		  if(x%2!=0 && y%2!=0&&x!=3&&y!=3&&x!=7&&y!=7)
		  {
			  osum=osum+(x*y);
		  }
	  }
	  dif=esum-osum;
	  System.out.println("Sum of product of consecutive even digits except 2 and 6 : "+esum);
	  System.out.println("Sum of product of consecutive odd digits except 3 and 7 : "+osum);
	  System.out.println("difference is : "+dif);

}
}
