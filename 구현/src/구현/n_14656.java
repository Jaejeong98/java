package ±¸Çö;

import java.io.*;

public class n_14656 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), count=0;
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T; i++) {
			if((i+1)!=Integer.parseInt(st[i]))
				count++;
		}
		System.out.println(count);
	}
}