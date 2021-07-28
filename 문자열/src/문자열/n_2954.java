package ¹®ÀÚ¿­;

import java.io.*;

public class n_2954 {
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    String st[]=br.readLine().split(""), l="aeiou", result="";
	    for(int i=0; i<st.length; i++){
	      result+=st[i];
	      if(l.contains(st[i]))
	        i+=2;
	    }
	    bw.write(result);
	    bw.flush(); bw.close();
	  }
}
