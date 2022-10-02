package java8project;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer t1,Integer t2)
	{
		if(t1<t2)
			return +1;
		if(t1>t2)
			return -1;
		else
			return 0;
	}
}

public class comparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
		t.add(10);
		t.add(15);
		t.add(20);
		t.add(50);
		System.out.println(t);

	}

}
