package ¹®ÀÚ¿­;

import java.util.*;

public class n_2744 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), newst="";
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)<97)
				newst+=(char)(st.charAt(i)+32);
			else
				newst+=(char)(st.charAt(i)-32);
		}
		System.out.println(newst);
	}
}
