package ±¸Çö2;

import java.io.*;

public class n_11795 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[3];
		for(int i=0; i<T; i++) {
			String st[]=br.readLine().split(" ");
			boolean b=false;
			for(int j=0; j<3; j++) {
				arr[j]+=Integer.parseInt(st[j]);
				if(arr[j]<30)
					b=true;
			}
			if(b)
				bw.write("NO\n");
			else {
				int min=Math.min(arr[0], Math.min(arr[1], arr[2]));
				bw.write(min+"\n");
				for(int j=0; j<3; j++)
					arr[j]-=min;
			}
		}
		bw.flush();bw.close();
	}
}
