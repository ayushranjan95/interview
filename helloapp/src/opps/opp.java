package opps;

public class opp {
	public void ismethod()
	{
		System.out.println("no agrument");
	}

	public void ismethod(int a)
	{
		System.out.println("Intiger argument");
	}
	public void ismethod(float b)
	{
		System.out.println("float Argument");
	}
	public void ismethod(double c)
	{
		System.out.println("double argument");
	}
	public void ismethod(int...i)
	{
		System.out.println("var-argument");
		
	}


	public static void main(String[] args) {
		opp b =new opp();
		b.ismethod(); 
		b.ismethod(10);
		b.ismethod(5.4f);
		b.ismethod(10.5);
		b.ismethod(10,20);
		
		
		
	}

}
