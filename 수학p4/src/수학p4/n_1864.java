package ¼öÇÐp4;

import java.io.*;

public class n_1864 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] st=br.readLine().split("");
			int sum=0, count=0;
			if(st[0].charAt(0)=='#')
				break;
			for(int i=0; i<st.length; i++) {
				int num=0;
				switch(st[i].charAt(0)) {
				case '-': num=0; break;
				case '\\': num=1; break;
				case '(': num=2; break;
				case '@': num=3; break;
				case '?': num=4; break;
				case '>': num=5; break;
				case '&': num=6; break;
				case '%': num=7; break;
				case '/': num=-1; break;
				}
				sum+=num*Math.pow(8, st.length-1-count);
				count++;
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
