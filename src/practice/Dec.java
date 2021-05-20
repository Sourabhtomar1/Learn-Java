package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> st = new LinkedList<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		System.out.print(st);
		st.remove();
		System.out.print(st);
		
	}

}
