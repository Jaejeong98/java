package Á¤·Ä;

import java.io.*;
import java.util.*;

public class n_9946 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int count=1;
        while(true){
            String st1=br.readLine(), st2=br.readLine();
            if(st1.equals("END")&&st2.equals("END")) break;
            String[] str1=st1.split(""), str2=st2.split("");
            Arrays.sort(str1);
            Arrays.sort(str2);
            boolean b=false;
            if(st1.length()!=st2.length())
            	b=true;
            else {
            	for(int i=0; i<str1.length; i++){
            		if(str1[i].equals(str2[i])==false){b=true; break;}
                }
            }
            bw.write("Case "+count+": "+(b?"different":"same")+"\n");
            count++;
        }
        bw.flush(); bw.close();
    }
}