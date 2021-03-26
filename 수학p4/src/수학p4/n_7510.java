package ¼öÇÐp4;

import java.io.*;
import java.util.*;

public class n_7510 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[3];
		for(int i=0; i<T; i++) {
			String str=br.readLine();
			StringTokenizer st=new StringTokenizer(str);
			for(int j=0; j<3; j++)
				arr[j]=Integer.parseInt(st.nextToken());
			Arrays.sort(arr);
			bw.write("Scenario #"+(i+1)+":\n");
			if(Math.pow(arr[2], 2)==Math.pow(arr[1], 2)+Math.pow(arr[0], 2))
				bw.write("yes\n");
			else
				bw.write("no\n");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
