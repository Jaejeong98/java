package ¹®ÀÚ¿­;

import java.util.*;

public class n_16171 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine(), st2=sc.nextLine(), st="";
		for(int i=0; i<st1.length(); i++) {
			int num=st1.charAt(i);
			if(num>=65&&num<=90||num>=97&&num<=122)
				st+=st1.charAt(i);
			else continue;
		}
		if(st.contains(st2)) System.out.println(1);
		else System.out.println(0);
	}
}