package ±¸Çö;

import java.io.*;

public class n_3062 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T; i++) {
			String st=br.readLine(), st1="";
			for(int j=st.length()-1; j>=0; j--)
				st1+=st.charAt(j);
			String num=Integer.toString(Integer.parseInt(st)+Integer.parseInt(st1));
			boolean t=true;
			for(int j=0; j<num.length(); j++) {
				if(num.charAt(j)!=num.charAt(num.length()-(j+1)))
					t=false;
			}
			bw.write(t==true?"YES":"NO");
			bw.write("\n");
		}
		bw.flush();bw.close();
	}
}