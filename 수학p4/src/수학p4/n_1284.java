package ¼öÇÐp4;

import java.io.*;

public class n_1284 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String st=br.readLine();
			int sum=1;
			if(st.equals("0"))
				break;
			for(int i=0; i<st.length(); i++) {
				if(st.charAt(i)=='0')
					sum+=4;
				else if(st.charAt(i)=='1')
					sum+=2;
				else
					sum+=3;
				sum++;
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
