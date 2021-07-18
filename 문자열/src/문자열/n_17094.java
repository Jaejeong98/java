package ¹®ÀÚ¿­;

import java.io.*;

public class n_17094 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()),counte=0, count2=0;
		String st[]=br.readLine().split("");
		for(int i=0; i<T; i++) {
			if(st[i].equals("e")) counte++;
			else count2++;
		}
		if(counte==count2) System.out.println("yee");
		else System.out.println(counte>count2? "e":"2");
	}
}
