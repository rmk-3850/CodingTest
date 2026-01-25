import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().split(" ");
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			
			int[] arr=new int[M];
			visited=new boolean[N+1];
			dfs(0, arr, N);
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static StringBuilder sb=new StringBuilder();
	static boolean first=true;
	static boolean[] visited;
	static String toString(int[] arr) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			if(i>0)sb.append(' ');
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	static void dfs(int depth,int[] arr,int max) {
		if(depth==arr.length) {
			if(!first) sb.append(System.lineSeparator());
			sb.append(toString(arr));
			first=false;
			return;
		}
		
		for(int i=1;i<=max;i++) {
			arr[depth]=i;
			dfs(depth+1,arr,max);
		}
	}
}