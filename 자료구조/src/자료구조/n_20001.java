package �ڷᱸ��;

import java.io.*;

public class n_20001 {
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String st="";
    int count=0;
    while((st=br.readLine()).equals("������ ����� ��")==false){
      if(st.equals("����")) count++;
      else if(st.equals("������")){
        if(count==0) count+=2;
        else count--;
      }
    }
    System.out.println(count==0?"�������� �����":"����");
  }
}