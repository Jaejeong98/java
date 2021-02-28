package ¼öÇÐp2;

import java.io.*;

public class n_3003 {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] ch= {1,1,2,2,2,8};
		String[] st=br.readLine().split(" ");
		for(int i=0; i<6; i++)
			System.out.print(ch[i]-Integer.parseInt(st[i])+" ");
	}
}
