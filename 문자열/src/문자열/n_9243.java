package ¹®ÀÚ¿­;

import java.io.*;

public class n_9243 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        String st1=br.readLine(), st2=br.readLine(),result="";
        if(T%2==0)
          System.out.println(st1.equals(st2)?"Deletion succeeded":"Deletion failed");
        else{
          for(int i=0; i<st1.length(); i++){
            if(st1.charAt(i)=='0') result+=1;
            else result+=0;
          }
          System.out.println(st2.equals(result)?"Deletion succeeded":"Deletion failed");
        }
    }
}