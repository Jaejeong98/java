package ¼öÇÐp4;

import java.io.*;
import java.util.*;

public class n_13416 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine()), sum=0;
			for(int j=0; j<num; j++) {
				String st=br.readLine();
				StringTokenizer str=new StringTokenizer(st);
				int arr[]=new int[3];
				for(int k=0; k<3; k++)
					arr[k]=Integer.parseInt(str.nextToken());
				Arrays.sort(arr);
				if(arr[2]<=0)
					continue;
				else
					sum+=arr[2];
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}