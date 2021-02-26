package ¼öÇĞp1;

import java.io.*;

public class n_1476 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] st=br.readLine().split(" ");
		int E=Integer.parseInt(st[0]), S=Integer.parseInt(st[1]), M=Integer.parseInt(st[2]);
		int i=0, num=0;
		if(E==15)
			E=0;
		if(S==28)
			S=0;
		if(M==19)
			M=0;
		while(true) {
			num=28*i+S;
			if(num%15==E&&num%19==M&&num>0)
				break;
			else
				i++;
		}
		System.out.println(num);
	}
}
