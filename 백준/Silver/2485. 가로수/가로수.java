import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			int N=Integer.parseInt(br.readLine());
			int[] arr=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}
			int[] interval=new int[N-1];
			
			for(int i=0;i<interval.length;i++) {
				interval[i]=arr[i+1]-arr[i];
			}
			Arrays.sort(interval);
			int gcd=0;
			for(int i=interval[0];i>0;i--) {
				if(isGcd(i, interval)) {
					gcd=i;
					break;
				}
			}
			
			int treeNum=0;
			for(int i=0;i<interval.length;i++) {
				treeNum+=interval[i]/gcd -1;
			}
			
			bw.write(String.valueOf(treeNum));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static boolean isGcd(int n,int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%n!=0) return false;
		}
		return true;
	}
}
