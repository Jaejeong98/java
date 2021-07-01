package Ω∫≈√;

import java.util.*;

public class n_10799 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split("");
		Stack<String>stack=new Stack<String>();
		int count=0;
		for(int i=0; i<st.length; i++) {
			if(st[i].equals("("))
				stack.add("(");
			else {
				if(st[i-1].equals("(")) {
					stack.pop();
					count+=stack.size();
				}
				else {
					stack.pop();
					count+=1;
				}
			}
		}
		System.out.println(count);
	}
}
