package æ÷µÂ»§;

import java.io.*;

public class n_20528 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(br.readLine());
    String st[]=br.readLine().split(" ");
    char ch=st[0].charAt(0);
    boolean b=false;
    for(int i=0; i<T; i++){
      int length=st[i].length()-1;
      if(st[i].charAt(0)!=ch||st[i].charAt(length)!=ch){
        b=true; break;
      }
    }
    System.out.println(b?0:1);
	}
}