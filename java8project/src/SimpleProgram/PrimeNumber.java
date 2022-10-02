package SimpleProgram;

public class PrimeNumber {
	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		//int n=10;
		for(int i=2;i<100;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i+":"+"this is prime number:");
			}
			else 
			{
				System.out.println(i+":"+"this is not prime number:");
			}
		}
		
	}

}
