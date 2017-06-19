package deltaDebug;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class StringToLL {

	public static void main(String[] args) {
		
		String s="Hello I am string, please convert me to linked list";
		List list=new LinkedList();
		StringTokenizer st = new StringTokenizer(s);
	     while (st.hasMoreTokens()) {
	        // System.out.println(st.nextToken());
	    	 list.add(st.nextToken());
	    	 
	     }
		System.out.println(list);
	}

}
