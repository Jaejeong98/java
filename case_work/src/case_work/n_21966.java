package case_work;

import java.io.*;

public class n_21966 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String st=br.readLine();
		if(T<=25)
			bw.write(st);
		else {
			String str=new String();
			boolean b=false;
			for(int i=12; i<T-12; i++) {
				if(st.charAt(i)=='.') {
					b=true;
					break;
				}
			}
			if(b) {
				for(int j=0; j<9; j++)
					bw.write(st.charAt(j));
				bw.write("......");
				for(int j=T-10; j<T; j++)
					bw.write(st.charAt(j));
			}
			else {
				for(int j=0; j<11; j++)
					bw.write(st.charAt(j));
				bw.write("...");
				for(int j=T-11; j<T; j++)
					bw.write(st.charAt(j));
			}
		}
		bw.flush();bw.close();
	}
}
