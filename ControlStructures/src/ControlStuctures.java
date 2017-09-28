//Jacky Chen
// 9/26/17
//Period 2
public class ControlStuctures 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeprinter();
		foobarbaz();
		
	}

	

	public static void foobarbaz()
	{
	for(int x=1;x<=500;x++)
	{
		if(x%3==0 && x%7==0 && x%10==0)
		{
			System.out.println("foobarbaz");
		}
		else if (x%7==0 && x%10==0)
		{
			System.out.println("barbaz");
		}
		else if (x%3==0 && x%7==0)
		{
			System.out.println("foobar");
		}
		else if (x%3==0 && x%10==0)
		{
			System.out.println("foobaz");
		}
		else if (x%3==0)
		{
			System.out.println("foo");
		}
		else if (x%7==0)
		{
			System.out.println("bar");
		}
		else if (x%10==0)
		{
			System.out.println("baz");
		}
		else
		{
			System.out.println(x);
		}
		
		}
	}
	public static void primeprinter()
	{
		int counter=0 , x=2;
		while (counter<=50)
		{
			if(isPrime(x))
			{
				System.out.print(x);
				counter++;
			}
			x++;
		}
	}

	public static boolean isPrime(int n)
	{
		for(int x=2;x<=n;x++)
		{
			if(n%x==0)
			{
				return false;
			}
		}
			
				return true;

	}
}



		
	

