package ¹®ÀÚ¿­;

import java.util.*;

public class n_21955 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		for(int i=0; i<st.length(); i++) {
			System.out.print(st.charAt(i));
			if(i==st.length()/2-1)
				System.out.print(" ");
		}
	}
}
