package 그리디_알고리즘_p1;

import java.util.*;

public class n_12904 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine(), st2=sc.nextLine();
		while(st2.length()!=st1.length()) {
			char c=st2.charAt(st2.length()-1);
			st2=st2.substring(0,st2.length()-1);
			if(c=='B') {
				StringBuilder st=new StringBuilder(st2);
				st2=st.reverse().toString();
			}
		}
		System.out.print(st1.equals(st2)?1:0);
	}
}
