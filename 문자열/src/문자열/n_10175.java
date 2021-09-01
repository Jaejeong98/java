package ¹®ÀÚ¿­;

import java.io.*;

public class n_10175 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int T=Integer.parseInt(br.readLine());
      for(int i=0; i<T; i++){
        String st[]=br.readLine().split(" "),str="";
        int arr[]=new int[4];
        for(int j=0; j<st[1].length(); j++){
          switch(st[1].charAt(j)){
            case 'B': arr[0]+=2;break;
            case 'C': arr[1]+=1;break;
            case 'M': arr[2]+=4;break;
            case 'W': arr[3]+=3;break;
          }
        }
        boolean b=false;
        int max=arr[0], n=0;
        for(int j=1; j<4; j++){
          if(max==arr[j]){b=true; break;}
          else if(max<arr[j]) {max=arr[j];n=j;}
        }
       if(b) bw.write(st[0]+": There is no dominant species\n");
       else {
         switch(n){
            case 0: str="Bobcat";break;
            case 1: str="Coyote";break;
            case 2: str="Mountain Lion";break;
            case 3: str="Wolf";break;
          }
         bw.write(st[0]+": The "+str+" is the dominant species\n");
         }
      }
      bw.flush();bw.close();
  }
}