package ±¸Çö;

import java.io.*;

public class n_11328 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int[] num=new int[26];
			boolean t=true;
			String[] st=br.readLine().split(" ");
			if(st[0].length()!=st[1].length())
				bw.write("Impossible\n");
			else {
				for(int j=0; j<st[0].length(); j++) {
					num[st[0].charAt(j)-'a']++;
					num[st[1].charAt(j)-'a']--;
				}
				for(int j=0; j<26; j++) {
					if(num[j]!=0) {
						t=false;
						break;
					}
				}
				if(t==true)
					bw.write("Possible\n");
				else
					bw.write("Impossible\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
