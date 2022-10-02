package java8;

public interface lambda {
	public void m();
}
class b
{
	public static void main(String[] args) {
		int height=10;
		lambda d=()->{
			System.out.println("height:"+height);
		};
		d.m();
	}
}
