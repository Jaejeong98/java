package ¹®ÀÚ¿­;

import java.util.*;

public class n_5598 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), st1="";
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)-3<'A')
				st1+=(char) (st.charAt(i)+23);
			else
				st1+=(char) (st.charAt(i)-3);
		}
		System.out.println(st1);
	}
}