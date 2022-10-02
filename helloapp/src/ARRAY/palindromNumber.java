package ARRAY;

public class palindromNumber {
	public static void main(String[] args) {
		int p=121;
		int temp,p1;
		int sum=0;
		temp=p;
		while(p>0)
		{
		  p1=p%10;
		  sum=(sum*10)+p1;
		  p=p/10;
		}
		if(sum==temp)
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("not a pallindrom");
		}
	}

}
