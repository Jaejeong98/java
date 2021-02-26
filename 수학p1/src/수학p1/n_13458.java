package ¼öÇÐp1;

import java.io.*;
import java.util.StringTokenizer;

public class n_13458 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String[] stu=br.readLine().split(" ");
		StringTokenizer st=new StringTokenizer(br.readLine());
		int proc1=Integer.parseInt(st.nextToken()), proc2=Integer.parseInt(st.nextToken());
		long sum=0;
		for(int i=0; i<N; i++) {
			int stu_n=Integer.parseInt(stu[i]),count=0;
			stu_n-=proc1;
			count++;
			if(stu_n>0) {
				count+=stu_n/proc2;
				if(stu_n%proc2!=0)
					count++;
			}
			sum+=count;
		}
		System.out.println(sum);
	}
}
