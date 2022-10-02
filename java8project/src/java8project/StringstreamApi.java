package java8project;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.*;

public class StringstreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>();
		st.add("ayush");
		st.add("ayus");
		st.add("ayh");
		st.add("ush"); 
		//list<String> st1=st.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
	   List<String> l2 = st.stream().map(s ->s.toUpperCase()).collect(Collectors.toList()); 
	   System.out.println(l2);
	   long l3=st.stream().map(s->s.length()==2).count();
	   System.out.println(l3);

	}

}
