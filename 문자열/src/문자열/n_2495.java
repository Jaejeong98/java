package ¹®ÀÚ¿­;

import java.io.*;

public class n_2495 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<3; i++) {
			String st[]=br.readLine().split("");
			int max=1, count=1;
			for(int j=1; j<8; j++) {
				if(st[j].equals(st[j-1])) {
					count++;
					max=Math.max(max,count);
				}
				else {
					max=Math.max(max, count);
					count=1;
				}
			}
			System.out.println(max);
		}
	}
}
