package java8;
interface lam{
	public void m();
}
public class B {
	public static void main(String[] args) {
		int h=10;
		lam l=()->{
			System.out.println(h);
		};
		  l.m();
	}

}
