package ¼öÇÐp3;

import java.util.*;

public class n_15353 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.next(), st2=sc.next();
		int length=Math.max(st1.length(),st2.length());
		int[] arr1=new int[length+1], arr2=new int[length+1];
		for(int i = st1.length() - 1, idx = 0; i >= 0; i--, idx++)
			arr1[idx] = Character.getNumericValue(st1.charAt(i));
		for(int i = st2.length() - 1, idx = 0; i >= 0; i--, idx++)
			arr2[idx] = Character.getNumericValue(st2.charAt(i));
		for(int i = 0; i < length; i++) {
			int value = arr1[i] + arr2[i];
			arr1[i] = value % 10;
			arr1[i + 1] += (value / 10);
		}
		StringBuilder sb = new StringBuilder();
		if(arr1[length] != 0)
			sb.append(arr1[length]);
		for(int i =length - 1; i >= 0; i--)
			sb.append(arr1[i]);
		System.out.println(sb);
	}
}