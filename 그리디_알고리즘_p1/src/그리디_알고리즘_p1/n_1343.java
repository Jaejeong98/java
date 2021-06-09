package 그리디_알고리즘_p1;

import java.util.*;

public class n_1343 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), result="";
		int count=0;
		for(int i=0; i<st.length(); i++) {
			char ch=st.charAt(i);
			count++;
			if(ch=='.'||i==st.length()-1) {
				if(ch=='.') count--;
				if(count%2==1) {
					System.out.println(-1);
					return;
				}else {
					for(int j=0; j<count/4; j++) result+="AAAA";
					count%=4;
					for(int j=0; j<count/2; j++) result+="BB";
					if(ch=='.') result+=".";
					count=0;
				}
			}
		}
		System.out.println(result);
	}
}
/*
public class n_1343 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		st=st.replace("XXXX", "AAAA");
		st=st.replace("XX", "BB");
		if(st.contains("X")) System.out.println(-1);
		else System.out.println(st);
	}
}*/
