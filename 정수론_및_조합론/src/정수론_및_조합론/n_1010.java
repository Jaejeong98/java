package 정수론_및_조합론;

import java.io.*;

public class n_1010 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int TC=Integer.parseInt(br.readLine());
		for(int i=0; i<TC; i++) {
			String st=br.readLine();
			String[] num=st.split(" ");
			int max=Math.max(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
			int min=Math.min(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
			long T=1, B=1;
			for(int j=max; j>Math.max(min,max-min);j--)
				T*=j;
			for(int j=1; j<=Math.min(min, max-min); j++)
				B*=j;
			System.out.println(T/B);
		}
	}
}
