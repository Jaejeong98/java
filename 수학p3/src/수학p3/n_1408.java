package ¼öÇÐp3;

import java.io.*;
import java.util.*;

public class n_1408 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st1=br.readLine().split(":");
		String[] st2=br.readLine().split(":");
		int s=Integer.parseInt(st2[2])-Integer.parseInt(st1[2]);
		int m=Integer.parseInt(st2[1])-Integer.parseInt(st1[1]);
		int h=Integer.parseInt(st2[0])-Integer.parseInt(st1[0]);
		if(s<0) {
			m--; s+=60;
		}
		if(m<0) {
			h--; m+=60;
		}
		if(h<0)
			h+=24;
		bw.write(String.format(Locale.getDefault(),"%1$02d:%2$02d:%3$02d", h, m, s));
		bw.flush();
		bw.close();
	}
}
