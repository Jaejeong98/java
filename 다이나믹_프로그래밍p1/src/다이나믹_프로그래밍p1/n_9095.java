package 다이나믹_프로그래밍p1;

import java.io.*;

public class n_9095 {
	public static int func(int num) {
		if(num==1||num==2||num==3)
			return (int) Math.pow(2, num-1);
		else
			return func(num-1)+func(num-2)+func(num-3);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int num=Integer.parseInt(br.readLine());
			bw.write(func(num)+"\n");
		}
		bw.flush();bw.close();
	}
}
