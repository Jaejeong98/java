package ¹®ÀÚ¿­;

import java.util.*;

public class n_13235 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		boolean b=false;
		for(int i=0; i<(int)Math.floor(st.length()/2); i++) {
			if(st.charAt(i)!=st.charAt(st.length()-1-i)) {
				b=true;
				break;
			}
		}
		System.out.println(b?"false":"true");
	}
}
