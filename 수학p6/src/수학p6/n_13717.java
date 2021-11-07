package ¼öÇÐp6;

import java.io.*;

public class n_13717 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine()), max=0, sum=0;
		String name="";
		for(int i=0; i<T; i++) {
			String st=br.readLine(), st2[]=br.readLine().split(" ");
			int n1=Integer.parseInt(st2[0]), n2=Integer.parseInt(st2[1]),c=0;
			while(n2-n1>=0) {
				c+=1;
				n2-=n1;
				n2+=2;
			}
			sum+=c;
			if(c>max) { max=c; name=st; }
		}
		System.out.println(sum+"\n"+name);
	}
}