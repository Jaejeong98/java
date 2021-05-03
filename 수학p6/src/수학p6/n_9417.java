package ¼öÇÐp6;

import java.io.*;

public class n_9417 {
	public static int gcd(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return gcd(num2, num1%num2);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] st=br.readLine().split(" ");
			int max=0;
			for(int j=0; j<st.length; j++) {
				for(int k=j+1; k<st.length; k++) {
					int num=gcd(Integer.parseInt(st[j]), Integer.parseInt(st[k]));
					if(max<num)
						max=num;
				}
			}
			bw.write(max+"\n");
		}
		bw.flush();
		bw.close();
	}
}
