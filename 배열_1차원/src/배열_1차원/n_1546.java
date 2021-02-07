package 배열_1차원;

import java.io.*;

public class n_1546 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		double max=0; 
		double sum=0;
		String[] st=br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			if(max<Integer.parseInt(st[i]))
				max=Integer.parseInt(st[i]);
		}
		for(int i=0; i<N; i++)
			sum+=Integer.parseInt(st[i])/max*100;
		System.out.println(sum/N);
	}
}
