package ±¸Çö;

import java.util.*;

public class n_10808 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int arr[]=new int[26];
		for(int i=0; i<st.length(); i++)
			arr[st.charAt(i)-'a']++;
		for(int i=0; i<26; i++)
			System.out.print(arr[i]+" ");
	}
}
