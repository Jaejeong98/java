package ¼öÇÐp2;

import java.util.*;

public class n_11816 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), n=new String();
		if(st.charAt(1)=='x') {
			for(int i=2; i<st.length(); i++)
				n+=st.charAt(i);
			System.out.println(Integer.parseInt(n,16));
		}
		else if(st.charAt(0)=='0')
			System.out.println(Integer.parseInt(st,8));
		else
			System.out.println(st);
	}
}
