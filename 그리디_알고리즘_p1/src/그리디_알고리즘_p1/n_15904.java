package 그리디_알고리즘_p1;

import java.io.*;

public class n_15904 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st[]=br.readLine().split(""), str="";
		for(int i=0; i<st.length; i++) {
			char s1=st[i].charAt(0);
			if(s1>='A'&&s1<='Z')
				str+=s1;
		}
		int j =0;
        for(int i=0; i<str.length(); i++) {
            if(j==0 && str.charAt(i)=='U')
                j+=1;
            if((j==1 || j==3) && str.charAt(i)=='C')
                j+=1;
            if(j==2 && str.charAt(i)=='P')
                j+=1;
        }
        if(j==4)
            System.out.println("I love UCPC");
        else
            System.out.println("I hate UCPC");
	}
}
