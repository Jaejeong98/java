package ¼öÇÐ5p;

import java.io.*;

public class n_19539 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), sum=0, count=0;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<T; i++) {
			sum+=Integer.parseInt(st[i]);
			if(Integer.parseInt(st[i])%2==1)
				count++;
		}
		if(sum%3==0&&count<=sum/3)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
