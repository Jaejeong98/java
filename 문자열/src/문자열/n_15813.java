package ¹®ÀÚ¿­;

import java.util.*;

public class n_15813 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), sum=0;
		String st=sc.next();
		for(int i=0; i<T; i++)
			sum+=st.charAt(i)-'A'+1;
		System.out.println(sum);
	}
}