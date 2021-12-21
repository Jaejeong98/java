package 그리디_알고리즘_p1;

import java.io.*;

public class n_16162 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(" "),  str[]=br.readLine().split(" ");
		int count=0, num=Integer.parseInt(st[1]);
		for(int i=0; i<Integer.parseInt(st[0]); i++) {
			if(Integer.parseInt(str[i])==num) {
				num+=Integer.parseInt(st[2]);
				count++;
			}
		}
		System.out.println(count);
	}
}