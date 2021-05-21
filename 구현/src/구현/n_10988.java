package ±¸Çö;

import java.util.*;

public class n_10988 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine(), newS=new String();
		String[] arr=st.split("");
		for(int i=arr.length-1; i>=0; i--)
			newS+=arr[i];
		System.out.println(st.equals(newS)?1:0);
	}
}
