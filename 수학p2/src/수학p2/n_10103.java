package ¼öÇÐp2;

import java.io.*;

public class n_10103 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine()), s=100, c=100;
		for(int i=0; i<n; i++) {
			String[] st=br.readLine().split(" ");
			int c_score=Integer.parseInt(st[0]), s_score=Integer.parseInt(st[1]);
			if(c_score>s_score) s-=c_score;
			else if(c_score<s_score) c-=s_score;
			else continue;
		}
		System.out.println(c+"\n"+s);
	}
}
