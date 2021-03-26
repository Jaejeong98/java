package ¼öÇÐp4;

import java.io.*;
import java.util.Locale;

public class n_3029 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] st1=br.readLine().split(":"), st2=br.readLine().split(":");
		int s=Integer.parseInt(st2[2])-Integer.parseInt(st1[2]);
		int m=Integer.parseInt(st2[1])-Integer.parseInt(st1[1]);
		int h=Integer.parseInt(st2[0])-Integer.parseInt(st1[0]);
		if(s<0) {
			s+=60; m--;
		}
		if(m<0) {
			m+=60; h--;
		}
		if(h<0||h==0&&m==0&&s==0)
			h+=24;
		bw.write(String.format(Locale.getDefault(), "%1$02d:%2$02d:%3$02d", h, m, s));
		bw.flush();
		bw.close();
	}
}
