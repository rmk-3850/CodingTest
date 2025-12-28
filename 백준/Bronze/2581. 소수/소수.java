import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int M=Integer.parseInt(br.readLine().trim());
			int N=Integer.parseInt(br.readLine().trim());
			
			int sum=0;
			int min=0;
			
			StringBuilder sb=new StringBuilder();
			
			for(int i=M;i<=N;i++) {
				if(isPrimeNumber(i)) {
					if(sum==0) min=i;
					sum+=i;
				}
			}
			if(sum==0) bw.write(String.valueOf(-1));
			else {
				sb.append(String.valueOf(sum))
					.append(System.lineSeparator())
					.append(String.valueOf(min));
				bw.write(sb.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	static boolean isPrimeNumber(int n) {
		if(n>=2) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) return false;
			}
			return true;
		}
		return false;
	}
}
