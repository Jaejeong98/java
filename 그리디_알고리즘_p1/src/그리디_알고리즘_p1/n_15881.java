package 그리디_알고리즘_p1;

import java.util.*;

public class n_15881 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), count=0;
		String st=sc.next(), pPAp="pPAp";
		for(int i=0; i<T; i++) {
			boolean b=false;
			for(int j=0; j<4; j++) {
				if(st.charAt(i+j)!=pPAp.charAt(j)){
					b=true;
					break;
				}
			}
			if(b==false) {
				count++;
				i+=3;
			}
			if(i+4>st.length())
				break;
		}
		System.out.println(count);
	}
}
