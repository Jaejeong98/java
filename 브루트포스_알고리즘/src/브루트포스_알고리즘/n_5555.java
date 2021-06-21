package 브루트포스_알고리즘;

import java.io.*;

public class n_5555 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		int T=Integer.parseInt(br.readLine()), count=0;
		for(int i=0; i<T; i++) {
			String str=br.readLine();
			str+=str;
			if(str.contains(st))
				count++;
		}
		System.out.println(count);
	}
}
