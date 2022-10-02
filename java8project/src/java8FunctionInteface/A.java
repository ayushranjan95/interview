package java8FunctionInteface;
interface inf1
{
	public void m2(int a,int b);
}
public class A {
	public static void main(String[] args) {
		inf1 i=(a,b)->System.out.println("Sum og two number:"+(a+b));
		i.m2(10, 30);
	}

}
