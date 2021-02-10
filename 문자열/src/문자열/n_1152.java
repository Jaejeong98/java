package ¹®ÀÚ¿­;

import java.io.*;

public class n_1152 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		String[] array=st.split(" ");
		int num=array.length;
		boolean T=false;
		
		for(int i=0; i<array.length; i++) {
			if(array[i].length()>0)
				T=true;
			else{
				if(T==false)
					num--;
			}
		}
		System.out.println(num);
	}
}
/*
 import java.util.*;

public class n_1152 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String ex=sc.nextLine().trim();
		
		if(ex.isEmpty())
			System.out.print("0");
		else
			System.out.print(ex.split(" ").length);
	}
}
 */
