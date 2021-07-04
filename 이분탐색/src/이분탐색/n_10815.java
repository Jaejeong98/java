package 이분탐색;

import java.io.*;
import java.util.Arrays;

public class n_10815 {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(br.readLine()), arr[]=new int[T];
		String st[]=br.readLine().split(" ");
		for(int i=0; i<T; i++)
			arr[i]=Integer.parseInt(st[i]);
		Arrays.sort(arr);
		int C=Integer.parseInt(br.readLine()), arr2[]=new int[C];
		String st2[]=br.readLine().split(" ");
		for(int i=0; i<C; i++)
			arr2[i]=Integer.parseInt(st2[i]);
		for(int i =0; i<C; i++){ 
            int max = T-1, min = 0, middle=0;
            boolean b=false;
            while(max>=min){
                middle = (min+max)/2;
                if(arr[middle]>arr2[i])
                	max=middle-1;
                else if(arr[middle]<arr2[i])
                   min=middle+1;
                else {
                	bw.write(1+" ");
                	b=true;
                	break;
                }
            }
            if(b==false)
            	bw.write(0+" ");
        }
		bw.flush();bw.close();
	}/*
	public static void main(String[] args)throws IOException{//다른분 풀이
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] strnum=br.readLine().split(" ");
		int m=Integer.parseInt(br.readLine());
		String[] strnum2=br.readLine().split(" ");
		StringBuilder sb=new StringBuilder();
		Arrays.sort(strnum);
		for(int j=0; j<m; j++)
			sb.append((Arrays.binarySearch(strnum,strnum2[j])>=0)?1+" ":0+" ");
		//binarySearch메서드는 오름차순으로 정렬된 배열을 가정하고 키 값이 key인 요소를 이진검색
		System.out.print(sb);
	}*/
}
