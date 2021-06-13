package ¹®ÀÚ¿­;

import java.io.*;

public class n_2857 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=new String[5];
		boolean t=false;
		for(int i=0; i<5; i++) {
			st[i]=br.readLine();
			if(st[i].contains("FBI")) {
				t=true;
				System.out.print((i+1)+" ");
			}
		}
		if(t==false)
			System.out.print("HE GOT AWAY!");
	}
}