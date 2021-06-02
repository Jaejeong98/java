package ¹®ÀÚ¿­;

import java.util.*;

public class n_17413 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		boolean t=false;
		 Stack stack = new Stack();
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)=='<') {
				while(stack.empty()==false)
					System.out.print(stack.pop());
				t=true;
				System.out.print(st.charAt(i));
			}else if(st.charAt(i)=='>') {
				System.out.print(st.charAt(i));
				t=false;
			}else if(t)
				System.out.print(st.charAt(i));
			else {
				if(st.charAt(i)==' ') {
					while(stack.empty()==false)
						System.out.print(stack.pop());
					System.out.print(" ");
				}
				else
					stack.add(st.charAt(i));
			}
		}
		while(stack.empty()==false)
			System.out.print(stack.pop());
	}
}