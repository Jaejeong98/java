package 배열_1차원;

import java.io.*;

public class n_4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int C=Integer.parseInt(br.readLine());
		for(int i=0; i<C+1; i++) {
			double sum=0, avg=0;
			int count=0;
			String[] st=br.readLine().split(" ");
			for(int j=1; j<=Integer.parseInt(st[0]); j++) {
				sum+=Integer.parseInt(st[j]);
				System.out.println(sum);
			}
			avg=sum/Integer.parseInt(st[0]);
			for(int j=1; j<=Integer.parseInt(st[0]); j++) {
				if(avg<Integer.parseInt(st[j]))
					count++;
			}
			System.out.println(String.format("%.3f", (double)count/Integer.parseInt(st[0])*100)+"%");
		}
	}
}
