package ±¸Çö2;

import java.io.*;

public class n_11800 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine());
		String[] st = {"Yakk","Doh","Seh","Ghar","Bang","Sheesh"};
		for(int i=0;i<T;i++){
			String[] str=br.readLine().split(" ");
			int n1=Integer.parseInt(str[0]), n2=Integer.parseInt(str[1]);
			if(n1 ==n2){
				switch(Integer.parseInt(str[0])){
				case 1:
					bw.write("Case "+ (i+1)+ ": Habb Yakk\n"); break;
				case 2:
					bw.write("Case "+ (i+1)+ ": Dobara\n"); break;
				case 3:
					bw.write("Case "+ (i+1)+ ": Dousa\n"); break;
				case 4:
					bw.write("Case "+ (i+1)+ ": Dorgy\n"); break;
				case 5:
					bw.write("Case "+ (i+1)+ ": Dabash\n"); break;
				case 6:
					bw.write("Case "+ (i+1)+ ": Dosh\n"); break;
				}
			}
			else if((n1 == 6 && n2 == 5) || (n1 == 5 && n2 == 6))
				bw.write("Case "+ (i+1)+ ": Sheesh Beesh\n");
			else {
				bw.write("Case "+ (i+1)+ ": ");
				if(n1<n2)
					bw.write(st[n2-1]+ " " +st[n1-1]+"\n");
				else
					bw.write(st[n1-1]+ " " +st[n2-1]+"\n");
			}
		}
		bw.flush();bw.close();
	}
}