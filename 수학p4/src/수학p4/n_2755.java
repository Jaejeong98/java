package ¼öÇÐp4;

import java.io.*;

public class n_2755 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		float sum_1=0,sum_2=0;
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			double g=0;
			if(st[2].charAt(0)=='F')
				g=0.0;
			else {
				if(st[2].charAt(0)=='A')
					g=4.0;
				else if(st[2].charAt(0)=='B')
					g=3.0;
				else if(st[2].charAt(0)=='C')
					g=2.0;
				else if(st[2].charAt(0)=='D')
					g=1.0;
				if(st[2].charAt(1)=='+')
					g+=0.3;
				if(st[2].charAt(1)=='-')
					g-=0.3;
			}
			sum_1+=Integer.parseInt(st[1]);
			sum_2+=Integer.parseInt(st[1])*g;
		}
		System.out.println(String.format("%.2f", sum_2/sum_1+0.000000001));
	}
}
