package ¼öÇÐp2;

import java.io.*;

public class n_5988 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String st=br.readLine();
			char ch=st.charAt(st.length()-1);
			if(Character.getNumericValue(ch)%2==0)
				bw.write("even\n");
			else
				bw.write("odd\n");
		}
		bw.flush();
		bw.close();
	}
}
