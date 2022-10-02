package java8FunctionInteface;
interface inf
{
	public void m1();// {}
}
public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inf i=()->System.out.println("hello method");
		i.m1();
	}

}
