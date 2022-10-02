package SimpleProgram;

public class FebbinacciSereis {
	public static void fib(int n)
	{
		int t1=0,t2=1,item=0;
		while(item<n)
		{
			System.out.println(t1+" ");
			int temp=t1+t2;
			t1=t2;
			t2=temp;
			item++;
		}
	}
	public static void main(String[] args) {
		int n=10;
		fib(n);
	}

}
