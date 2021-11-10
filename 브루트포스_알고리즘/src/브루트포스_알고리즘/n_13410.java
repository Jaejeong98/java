package 브루트포스_알고리즘;

import java.util.*;
import java.io.*;

public class n_13410 {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt(), max=0;
		for(int i=1; i<=n2; i++) {
			int num=n1*i;
			String num_r=new StringBuffer(Integer.toString(num)).reverse().toString();
			max=Integer.parseInt(num_r)>max?Integer.parseInt(num_r):max;
		}
		System.out.println(max);
	}
}
