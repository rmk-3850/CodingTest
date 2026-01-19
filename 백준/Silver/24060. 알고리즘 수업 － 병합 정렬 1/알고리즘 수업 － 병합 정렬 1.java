import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] line1=br.readLine().split(" ");
			int N=Integer.parseInt(line1[0]);
			int K=Integer.parseInt(line1[1]);
			
			String[] line2=br.readLine().split(" ");
			
			int[] arr=new int[line2.length];
			for(int i=0;i<arr.length;i++) arr[i]=Integer.parseInt(line2[i]);
			merge_sort(arr, 0, N-1);
			int result=list.size()<K ? -1 : list.get(K-1);
			bw.write(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static ArrayList<Integer> list=new ArrayList<Integer>();
	static void merge_sort(int[] arr,int p,int r) {
		if(p<r) {
			int q=(p+r)/2;
			merge_sort(arr, p, q);
			merge_sort(arr, q+1, r);
			merge(arr,p,q,r);			
		}
	}
	static void merge(int[] arr,int p,int q,int r) {
		int[] tmp=new int[r-p+1];
		int i=p;int j=q+1;int t=0;
		while(i<=q && j<=r) {
			tmp[t++]=arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		while(i<=q) {
			tmp[t++]=arr[i++];
		}
		while(j<=r) {
			tmp[t++]=arr[j++];
		}
		i=p;t=0;
		while(i<=r) {
			list.add(tmp[t]);
			arr[i++]=tmp[t++];
		}
	}
}