package 그리디_알고리즘_p1;

import java.io.*;

public class n_1439 {
    public static void main(String[] args)throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String st[]=br.readLine().split("");
       int z=0, o=0;
       for(int i=1; i<st.length; i++){
         if(st[i].equals("0")&&st[i-1].equals("1")) o++;
         else if(st[i].equals("1")&&st[i-1].equals("0")) z++;
       }
       if(st[st.length-1].equals("0"))z++;
       else o++;
       System.out.println(Math.min(o,z));
    }
}