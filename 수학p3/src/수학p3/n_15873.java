package ¼öÇÐp3;

import java.util.*;

public class n_15873 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		if(st.length()==2)
			System.out.println(Character.getNumericValue(st.charAt(0))+Character.getNumericValue(st.charAt(1)));
		else if(st.length()==3) {
			if(st.charAt(1)=='0')
				System.out.println(10+Character.getNumericValue(st.charAt(2)));
			else
				System.out.println(10+Character.getNumericValue(st.charAt(0)));
		}
		else
			System.out.println(20);
	}
}
