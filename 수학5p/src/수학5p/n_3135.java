package ¼öÇÐ5p;

import java.io.*;

public class n_3135 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int T=Integer.parseInt(br.readLine());
		int min=Math.abs(Integer.parseInt(st[1])-Integer.parseInt(st[0]));
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine());
			int sub=Math.abs(num-Integer.parseInt(st[1]));
			if(min>sub)
				min=sub;
		}
		if(Math.abs(Integer.parseInt(st[1])-Integer.parseInt(st[0]))==min)
			System.out.println(min);
		else
			System.out.println(min+1);
	}
}
