package ¼öÇÐp3;

import java.io.*;

public class n_10409 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		String[] st1=br.readLine().split(" ");
		int T=Integer.parseInt(st[0]), sum=0, count=0;
		for(int i=0; i<T;i++) {
			sum+=Integer.parseInt(st1[i]);
			if(sum<=Integer.parseInt(st[1]))
				count++;
			else
				break;
		}
		System.out.println(count);
	}
}