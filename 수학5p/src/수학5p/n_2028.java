package ¼öÇÐ5p;

import java.io.*;

public class n_2028 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine()), j=0;
			String st=Integer.toString(num*num),st1=Integer.toString(num), stn=new String();
			while(st1.length()!=j) {
				stn+=st.charAt(st.length()-st1.length()+j);
				j++;
			}
			if(stn.equals(st1))
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		bw.flush();
		bw.close();
	}
}
