package 巩磊凯;

import java.io.*;

public class n_17350 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		boolean b=false;
		for(int i=0; i<T; i++) {
			String st=br.readLine();
			if(st.equals("anj")) {
				b=true;
				break;
			}
		}
		System.out.println(b?"构具;":"构具?");
	}
}
