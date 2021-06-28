package 브루트포스_알고리즘;

import java.io.*;

public class n_2386 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=new String();
		while((st=br.readLine()).equals("#")==false) {
			char ch=st.charAt(0);
			int count=0;
			for(int i=2; i<st.length(); i++) {
				char al=st.charAt(i);
				if(al>=65&&al<=90)
					al+=32;
				if(al==ch)
					count++;
			}
			bw.write(ch+" "+count+"\n");
		}
		bw.flush();bw.close();
	}
}
