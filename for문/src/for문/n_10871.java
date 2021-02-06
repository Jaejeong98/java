package for¹®;

import java.io.*;
import java.util.*;

public class n_10871 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		
		String[] str=br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			if(Integer.parseInt(str[i])<X)
				bw.write(Integer.parseInt(str[i])+" ");
		}
		bw.flush();
		bw.close();
	}
}
