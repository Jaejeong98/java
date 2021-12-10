package ¹®ÀÚ¿­;

import java.util.*;

public class n_20154{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int arr[]= {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
		int sum=0;
		for(int i=0; i<st.length(); i++)
			sum+=arr[st.charAt(i)-'A'];
		System.out.println(sum%2==1?"I'm a winner!":"You're the winner?");
	}
}