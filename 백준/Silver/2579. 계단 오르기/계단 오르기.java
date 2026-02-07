import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			int[] A=new int[N];
			for(int i=0;i<N;i++) {
				A[i]=Integer.parseInt(br.readLine());
			}
			int[][] dp=new int[N][2];
			dp[0][0]=A[0];
			if(N>1) {
				dp[1][0]=A[1];
				dp[1][1]=A[0]+A[1];				
			}
			for(int i=2;i<N;i++) {
				dp[i][0]=Math.max(dp[i-2][0], dp[i-2][1])+A[i];
				dp[i][1]=dp[i-1][0]+A[i];
			}
			bw.write(String.valueOf(Math.max(dp[N-1][0], dp[N-1][1])));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}