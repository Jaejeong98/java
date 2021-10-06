package ¼öÇÐp6;

import java.util.*;

public class n_5893 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), st2=st+"0000";
		int i=0, c=0;
		ArrayList list=new ArrayList<Integer>();
		while(i!=st2.length()) {
			int n2=st2.charAt(st2.length()-1-i)-'0';
			if(i>=st.length()) {
				if(n2+c>=2) { list.add(n2+c-2);c=1;}   
				else { list.add(n2+c);c=0;}
			}else {
				int n1=st.charAt(st.length()-1-i)-'0';
				if(n1+n2+c>=2) { list.add(n1+n2+c-2);c=1;}   
				else { list.add(n1+n2+c);c=0;}
			}
			i++;
		}
		if(c==1) list.add(1);
		for(int j=list.size()-1; j>=0; j--)
			System.out.print(list.get(j));
	}
}