package 시뮬레이션;

import java.util.*;

public class n_13216 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int a=0, b=0, aw=0,bw=0;
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)=='A') a++;
			else b++;
			if(a>=21||b>=21) {
				System.out.println(a+"-"+b);
				if(a>=21) aw++;
				else bw++;
				a=0;b=0;
			}
		}
		System.out.println(aw>bw?"A":"B");
	}
}