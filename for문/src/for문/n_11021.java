package for��;

import java.io.*;
import java.util.*;

public class n_11021 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+(A+B)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
