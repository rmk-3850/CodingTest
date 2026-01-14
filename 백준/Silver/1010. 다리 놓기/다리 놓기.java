import java.io.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int T=Integer.parseInt(br.readLine());
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(T-->0) {
				if(!first) sb.append(System.lineSeparator());
				String[] input=br.readLine().split(" ");
				int x=Integer.parseInt(input[0]);
				int M=Integer.parseInt(input[1]);
				int N=x<(M+1)/2 ? x : M-x; 
				long result= permutation(M, N)/factorial(N);
				sb.append(result);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static long permutation(int n,int k) {
		long result=1;
		int bound=n-k;
		while(n>bound) {
			result*=n--;
		}
		return result;
	}
	static long factorial(int n) {
		if(n==0) return 1L;
		else {
			long result=1;
			while(n>0) {
				result*=n--;
			}
			return result;
		}
	}
}