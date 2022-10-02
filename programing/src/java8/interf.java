package java8;



interface fig{
		int m(int a,int b);
	}
public class interf {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		fig f=(a,b)->(a+b);
		
		System.out.println(f.m(10, 20));
		fig f1=(a,b)->{
			return (a+b);
		};
		System.out.println(f1.m(100, 2000));
	}

}
