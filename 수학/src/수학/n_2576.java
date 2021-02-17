package ¼öÇÐ;

import java.io.*;

public class n_2576 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0, min=100;
		for(int i=0; i<7; i++) {
			int num=Integer.parseInt(br.readLine());
			if(num%2!=0) {
				sum+=num;
				if(min>num)
					min=num;
			}
		}
		if(sum==0)
			System.out.println(-1);
		else
			System.out.println(sum+"\n"+min);
	}
}
