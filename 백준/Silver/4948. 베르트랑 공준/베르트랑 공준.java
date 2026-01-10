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
			
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(true) {
				int n=Integer.parseInt(br.readLine());
				if(n==0) break;
				if(!first) sb.append(System.lineSeparator());
				int count=0;
				for(int i=n+1;i<=2*n;i++) {
					if(isPrimeNum(i)) count++;
				}
				sb.append(count);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static boolean isPrimeNum(int n) {
		if(n==1 || n>2 && n%2==0) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}