package ¼öÇÐp2;

import java.util.*;

public class n_2745 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int pow=sc.nextInt(), arr[]=new int[127], sum=0;
		for(int i='0'; i<='9'; i++)
			arr[i]=i-'0';
		for(int i='A'; i<='Z'; i++)
			arr[i]=i-'A'+10;
		for(int i=0; i<st.length(); i++)
			sum+=(int)Math.pow(pow, i)*arr[st.charAt(st.length()-i-1)];
		System.out.println(sum);
	}
}
