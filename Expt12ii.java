package assignment2;

public class Expt12ii {
public static void main(String[] args) {
	int avge=0,avgo=0,dif=0,ne=0,no=0,se=0,so=0;
	for(int i=0;i<args.length;i++)
	{
		if(Integer.parseInt(args[i])%2==0)
		{
			ne++;
			se=se+Integer.parseInt(args[i]);
		}else
		{
			no++;
			so=so+Integer.parseInt(args[i]);
		}
	}
	avge=se/ne;
	avgo=so/no;
	dif=avge-avgo;
	System.out.println("Average of even no. :"+avge);
	System.out.println("Average of odd number :"+avgo);
	System.out.println("Difference between average of even and odd number:"+dif);
}
}
