package ±¸Çö2;

import java.io.*;

public class n_10807 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), count=0;
		String st[]=br.readLine().split(" "), st1=br.readLine();
		for(int i=0; i<T; i++) {
			if(st[i].equals(st1))
				count++;
		}
		System.out.println(count);
	}
}
