package ¹®ÀÚ¿­;

import java.io.*;

public class n_11008 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int count=0, time=0;
			String st[]=br.readLine().split(" ");
			if(!st[0].contains(st[1])) bw.write(st[0].length()+"\n");
			else {
				while(count<st[0].length()-st[1].length()+1) {
					if(st[0].charAt(count)==st[1].charAt(0)) {
						boolean b=false;
						for(int j=0; j<st[1].length(); j++) {
							if(st[0].charAt(j+count)!=st[1].charAt(j)) {
								b=true; break;
							}
						}
						if(!b) {
							count+=st[1].length();
							time++;
							continue;
						}
					}
					count++;
				}
			}
			bw.write(st[0].length()-(st[1].length()-1)*time+"\n");
		}
		bw.flush();bw.close();
	}
}