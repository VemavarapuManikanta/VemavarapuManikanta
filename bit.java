import java.util.*;
class bit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=s.nextInt();
		if((a&1)==0)
		{
		System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

	}
}
