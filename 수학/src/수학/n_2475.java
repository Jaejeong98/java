package ¼öÇÐ;

import java.io.*;

public class n_2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] num=br.readLine().split(" ");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n=Integer.parseInt(num[i]);
			sum+=Math.pow(n, 2);
		}
		System.out.println(sum%10);
	}
}
