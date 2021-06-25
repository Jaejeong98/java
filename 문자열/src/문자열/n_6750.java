package ¹®ÀÚ¿­;

import java.util.*;

public class n_6750 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), r="IOSHZXN";
		boolean b=false;
		for(int i=0; i<st.length(); i++) {
			if(r.contains(Character.toString(st.charAt(i))))
				continue;
			else {
				b=true;
				break;
			}
		}
		System.out.println(b==true?"NO":"YES");
	}
}
