package æ÷µÂ»§;

import java.io.*;

public class n_13322 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String st=br.readLine();
		int length=st.length();
		for(int i=0; i<length; i++)
			bw.write(i+"\n");
		bw.flush();bw.close();
	}
}
