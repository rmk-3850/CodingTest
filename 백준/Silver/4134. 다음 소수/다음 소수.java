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
			
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(N-->0) {
				if(!first) sb.append(System.lineSeparator());
				long n=Long.parseLong(br.readLine());
				while(true) {
					if(isPrimeNum(n)) break;
					n++;
				}
				sb.append(n);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static boolean isPrimeNum(long n) {
		if(n==0 || n==1 || n>2 && n%2==0) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
