package assignment2;

public class Expt12i {
public static void main(String[] args) {
	int temp=0, largest=0,smallest=0;
	for(int i=0;i<args.length;i++)
	{
		if(Integer.parseInt(args[i])<Integer.parseInt(args[i+1]))
		{
			if(Integer.parseInt(args[i+1])> largest)
			{
				largest = Integer.parseInt(args[i+1]);
			}
			 if(Integer.parseInt(args[i])<smallest)
			 {
				 smallest=Integer.parseInt(args[i]);
			 }
			 
		}else
		{
			if(Integer.parseInt(args[i])> largest)
			{
				largest = Integer.parseInt(args[i]);
			}
			 if(Integer.parseInt(args[i+1])<smallest)
			 {
				 smallest=Integer.parseInt(args[i+1]);
			 }
			
			 
		}
		
	}
	System.out.println("Largest no. is :"+largest);
	System.out.println("smallest no. is:"+smallest);
}
}
