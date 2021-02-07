package 배열_1차원;

import java.io.*;

public class n_10818 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N=Integer.parseInt(br.readLine());
		String[]st=br.readLine().split(" ");
		int max=Integer.parseInt(st[0]), min=Integer.parseInt(st[0]);
		for(int i=1; i<N; i++) {
			if(Integer.parseInt(st[i])>max)
				max=Integer.parseInt(st[i]);
			if(Integer.parseInt(st[i])<min)
				min=Integer.parseInt(st[i]);
		}
		System.out.println(min+" "+max);
	}
}
