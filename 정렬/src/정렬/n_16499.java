package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_16499 {
  public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine()), count=0;
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0; i<T; i++){
            String st[]=br.readLine().split(""), string="";
            Arrays.sort(st);
            for(int j=0; j<st.length; j++) string+=st[j];
            if(list.contains(string)==false) {count++;list.add(string);}
        }
        System.out.println(count);
	}
}