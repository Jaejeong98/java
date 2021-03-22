package ¼öÇÐp1;

import java.io.*;

public class n_1541 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st1=br.readLine().split("-"), st2=st1[0].split("\\+");
		int answer=0;
		for(int i=0; i<st2.length; i++)
			answer+=Integer.parseInt(st2[i]);
		for(int i=1; i<st1.length; i++) {
			st2=st1[i].split("\\+");
			for(int j=0; j<st2.length; j++)
				answer-=Integer.parseInt(st2[j]);
		}
		System.out.println(answer);
	}
}