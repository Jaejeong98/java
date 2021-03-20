package ¼öÇÐp2;

import java.util.*;

public class n_10823 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String st=new String();
		int sum=0;
		while(sc.hasNextLine())
			st+=sc.nextLine();
		String[] st1=st.split(",");
		for(int i=0; i<st1.length; i++) 
			sum+=Integer.parseInt(st1[i]);
		System.out.println(sum);
	}
}
