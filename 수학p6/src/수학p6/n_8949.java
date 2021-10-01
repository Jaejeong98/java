package ¼öÇÐp6;

import java.util.*;

public class n_8949 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] st1=sc.next().split(""), st2=sc.next().split("");
		int len1=st1.length, len2=st2.length, c=Math.min(len1, len2), i=0; 
		ArrayList list=new ArrayList<Integer>();
		while(c>0) {
			list.add(Integer.parseInt(st2[len2-i-1])+Integer.parseInt(st1[len1-i-1]));
			i++; c--;
		}
		if(len1!=len2) {
			for(int j=Math.abs(len2-len1)-1; j>=0; j--)
				list.add(len1>len2? st1[j]:st2[j]);
		}
		Collections.reverse(list);
		for(int j=0; j<list.size(); j++)
			System.out.print(list.get(j));
	}
}