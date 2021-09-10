package 브루트포스_알고리즘;

import java.io.*;

public class n_5671 {
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String st=new String();
		while((st=br.readLine())!=null){
            String str[]=st.split(" ");
            int n1=Integer.parseInt(str[0]), n2=Integer.parseInt(str[1]), count=0;
            for(int i=n1; i<=n2; i++){
                int arr[]=new int[10];
                boolean b=false;
                String num=Integer.toString(i);
                for(int j=0; j<num.length(); j++){
                    if(arr[num.charAt(j)-'0']!=0) {b=true; break;}
                    arr[num.charAt(j)-'0']++;
                }
                if(b==true) b=false;
                else count++;
            }
            System.out.println(count);
        }
	}
}