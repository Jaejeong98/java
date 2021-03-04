package ¼öÇÐp2;

import java.io.*;

public class n_10214 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), k=0, y=0;
		for(int i=0; i<T; i++) {
			for(int j=0; j<9; j++) {
				String[] st=br.readLine().split(" ");
				y+=Integer.parseInt(st[0]);
				k+=Integer.parseInt(st[1]);
			}
			if(k>y)
				System.out.println("Korea");
			else if(k<y)
				System.out.println("Yonsei");
			else
				System.out.println("Draw");
		}
	}
}
