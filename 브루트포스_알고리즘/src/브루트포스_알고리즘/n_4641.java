package 브루트포스_알고리즘;

import java.io.*;
import java.util.*;

public class n_4641 {
	public static void main(String[] args)throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    String st=new String();
	    while((st=br.readLine()).equals("-1")==false){
	      String str[]=st.split(" ");
	      int count=0, arr[]=new int[str.length-1];
	      for(int i=0; i<str.length-1; i++)
	        arr[i]=Integer.parseInt(str[i]);
	      Arrays.sort(arr);
	      for(int i=0; i<arr.length-1; i++){
	        for(int j=i+1; j<arr.length; j++){
	          if(arr[i]*2==arr[j]){ count++; break;}
	        }
	      }
	      bw.write(count+"\n");
	    }
	    bw.flush(); bw.close();
	  }
}
