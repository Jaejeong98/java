package 기본수학1;

import java.io.*;
import java.util.*;
public class n_10250 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int H=Integer.parseInt(st.nextToken());
			int W=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(st.nextToken());
			if((N/H+1)<10)
				System.out.println(N%H+"0"+(N/H+1));
			else
				System.out.println(N%H+""+(N/H+1));
		}
	}
}
