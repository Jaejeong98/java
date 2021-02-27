package ¼öÇÐp2;

import java.io.*;

public class n_5063 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int r=Integer.parseInt(st[0]), e=Integer.parseInt(st[1]), c=Integer.parseInt(st[2]);
			if(r>e-c)
				System.out.println("do not advertise");
			else if(r==e-c)
				System.out.println("does not matter");
			else
				System.out.println("advertise");
				
		}
	}
}
