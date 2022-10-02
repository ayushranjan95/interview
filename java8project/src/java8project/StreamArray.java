package java8project;

import java.util.*;
import java.util.stream.*;  

public class StreamArray {
	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(14);
		l.add(14);
		l.add(12);
		List<Integer> l2 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l);
		System.out.println(l2);
		//greater values 12
		List<Integer> l3=l.stream().filter(i->i>12).collect(Collectors.toList());
		System.out.println(l3);
		//Sorting stream
		List<Integer> l4=l.stream().sorted().collect(Collectors.toList());
		System.out.println(l4);
		//Customized sorting
		List<Integer> l5=l.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(l5);
		//max value in arraylist
		int l6=l.stream().max((s1,s2)-> s1.compareTo(s2)).get();
		System.out.println(l6);
		//min value of list
		int l7=l.stream().min((s1,s2)-> s1.compareTo(s2)).get();
		System.out.println(l7);
		
	}

}
