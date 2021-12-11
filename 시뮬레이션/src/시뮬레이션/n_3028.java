package 시뮬레이션;

import java.util.*;

public class n_3028{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st[]=sc.nextLine().split("");
		int n=1;
		for(int i=0; i<st.length; i++) {
			if(st[i].equals("A")&&(n==1||n==2))
				n=(n==1?2:1);
			else if(st[i].equals("B")&&(n==2||n==3))
				n=(n==2?3:2);
			else if(st[i].equals("C")&&(n==1||n==3))
				n=(n==3?1:3);
		}
		System.out.println(n);
	}
}