import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int T=Integer.parseInt(br.readLine());
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(T-->0) {
				if(!first) sb.append(System.lineSeparator());
				int N=Integer.parseInt(br.readLine());
				arr=new boolean[N+1];
				Arrays.fill(arr, true);
				sieve(N);
				sb.append(numberOfGBP(N));
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static boolean[] arr;
	static void sieve(int n) {
		arr[0]=false;
		arr[1]=false;
		for(int i=2;i*i<=n;i++) {
			if(arr[i]) {
				for(int j=i;j*i<=n;j++) {
					arr[j*i]=false;
				}
			}
		}
	}
	static int numberOfGBP(int n) {
		int result=0;
		for(int i=2;i<=n/2;i++) {
			if(arr[i] && arr[n-i]) result++;
		}
		return result;
	}
}