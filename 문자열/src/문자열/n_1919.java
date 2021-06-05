package ¹®ÀÚ¿­;

import java.util.*;

public class n_1919 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), st1=sc.nextLine();
		int arr[]=new int[26], count=0;
		for(int i=0; i<st.length(); i++)
			arr[(st.charAt(i)-'a')]++;
		for(int i=0; i<st1.length(); i++)
			arr[(st1.charAt(i)-'a')]--;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0)
				count+=Math.abs(arr[i]);
		}
		System.out.println(count);
	}
}
