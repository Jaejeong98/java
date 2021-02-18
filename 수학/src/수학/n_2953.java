package ¼öÇÐ;

import java.io.*;

public class n_2953 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int max=0, num=0;
		for(int i=0; i<5; i++) {
			int sum=0;
			String[] st=br.readLine().split(" ");
			for(int j=0; j<4; j++)
				sum+=Integer.parseInt(st[j]);
			if(sum>max) {
				max=sum;
				num=i+1;
			}
		}
		System.out.println(num+" "+max);
	}
}
