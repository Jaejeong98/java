package ¼öÇÐp2;

import java.util.*;

public class n_1356 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		boolean same=false;
		for(int i=0; i<st.length()-1; i++) {
			int n1=1, n2=1;
			for(int j=0; j<=i; j++)
				n1=n1*Character.getNumericValue(st.charAt(j));
			for(int j=i+1; j<st.length(); j++)
				n2=n2*Character.getNumericValue(st.charAt(j));
			if(n1==n2) {
				same=true;
				break;
			}
		}
		if(same==true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
