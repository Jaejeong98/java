package ¹®ÀÚ¿­;

import java.util.*;

public class n_11655 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		for(int i=0; i<st.length(); i++) {
			int num=st.charAt(i);
			if(num>=65&&num<=90) {
				num+=13;
				if(num>90)
					num-=26;
			}
			else if(num>=97&&num<=122) {
				num+=13;
				if(num>122)
					num-=26;
			}
			System.out.print((char)num);
		}
	}
}