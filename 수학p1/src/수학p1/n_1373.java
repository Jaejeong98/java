package ¼öÇÐp1;

import java.util.*;

public class n_1373 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int length=st.length();
		if(length%3==1)
			System.out.print(st.charAt(0));
		else if(length%3==2)
			System.out.print((st.charAt(0)-'0')*2+(st.charAt(1)-'0'));
		for(int i=length%3; i<length; i+=3)
			System.out.print((st.charAt(i)-'0')*4+(st.charAt(i+1)-'0')*2+(st.charAt(i+2)-'0'));
	}
}
