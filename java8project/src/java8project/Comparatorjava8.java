package java8project;

//import java.util.ArrayList;
import java.util.TreeSet;

public class Comparatorjava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);  
		t.add(10);
		t.add(20);
		t.add(5);
		System.out.println(t);
		

	}

}
