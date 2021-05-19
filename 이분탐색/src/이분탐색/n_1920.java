package 이분탐색;

import java.io.*;
import java.util.*;

public class n_1920 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String st[]=br.readLine().split(" ");
		int C=Integer.parseInt(br.readLine()), num[]=new int[C];
		String st2[]=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		for(int i=0; i<C; i++)
			num[i]=Integer.parseInt(st2[i]);
		for(int i =0; i<C; i++){
            int min=-1, max = T, mid=0, t=0;
            while(max - min > 1){ 
                mid = (min+max)/2;
                if(num[i] == arr[mid]){
                	t = 1; 
                    break;
                }
                if(num[i] > arr[mid])
                    min = mid;
                else if(num[i] < arr[mid]) 
                    max = mid;
            }
            bw.write(t+"\n");
            /*
            int n = Arrays.binarySearch(arr, num[i]);
            if (n < 0) bw.write("0\n");
            else bw.write("1\n");이분탐색 함수 사용*/
        }
		bw.flush();bw.close();
	}
}
