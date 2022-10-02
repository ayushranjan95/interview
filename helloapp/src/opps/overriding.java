package opps;
class parent{
	public void property()
	{
		System.out.println("cash+land");
	}
	public void marry()
	{
		System.out.println("will you ");
	}
}
class child extends parent
{
	public void marry()
	{
		System.out.println("will ");
	}
}
class overriding {
	public static void main(String[] args) {
		parent p=new parent();
		p.marry();
		child c=new child();
		c.property();
		c.marry();
		parent p1 =new child();
		p1.marry();
		p1.property();
		
	}

}
