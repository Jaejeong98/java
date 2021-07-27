package ¹®ÀÚ¿­;

import java.io.*;

public class n_11319 {
	public static void main(String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    int T=Integer.parseInt(br.readLine());
	    String l="aeiou";
	    for(int i=0; i<T; i++){
	      String st=br.readLine().toLowerCase(), str[]=st.split("");
	      int n2=0, n1=0;
	      for(int j=0; j<st.length(); j++){
	        if(str[j].equals(" ")) n1++;
	        else if(l.contains(str[j])) n2++;
	      }
	      bw.write((st.length()-n1-n2)+" "+n2+"\n");
	    }
	    bw.flush(); bw.close();
	  }
}
