package ¹®ÀÚ¿­;

import java.io.*;

public class n_1100 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		for(int i=0; i<8; i++) {
			String[] st=br.readLine().split("");
			if(i%2==0) {
				for(int j=0; j<8; j+=2) {
					if(st[j].equals("F"))
						count++;
				}
			}else {
				for(int j=1; j<8; j+=2) {
					if(st[j].equals("F"))
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
