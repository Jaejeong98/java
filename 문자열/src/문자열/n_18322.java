package ¹®ÀÚ¿­;

import java.util.*;

public class n_18322 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		sc.nextLine();
		String st[]=sc.nextLine().split(" "), result=st[0];
		int count=st[0].length();
		for(int i=1; i<n; i++) {
			if(count+st[i].length()>k) {
				System.out.println(result);
				result=st[i]; count=st[i].length();
			}
			else {
				count+=st[i].length();
				result+=" "+st[i];
			}
		}
		System.out.println(result);
	}
}