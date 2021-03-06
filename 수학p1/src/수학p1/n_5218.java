package ¼öÇÐp1;

import java.io.*;

public class n_5218 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T;i++) {
			String st=br.readLine();
			bw.write("Distances: ");
			for(int j=0; j<(st.length()-1)/2;j++) {
				int n1=st.charAt(j+(st.length()+1)/2), n2=st.charAt(j);
				if(n1<n2)
					n1+=26;
				bw.write((n1-n2)+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
