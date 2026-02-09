import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");			
			int[] A=new int[N];
			for(int i=0;i<N;i++) {
				A[i]=Integer.parseInt(input[i]);
			}
			int[][] dp=new int[N][2];
			dp[0][0]=dp[0][1]=1;
			int max=1;
			for(int i=1;i<N;i++) {
				dp[i][0]=dp[i][1]=1;
				for(int j=0;j<i;j++) {
					if(A[i]>A[j]) {
						dp[i][0]=Math.max(dp[i][0], dp[j][0]+1);
						max=Math.max(max, dp[i][0]);
					}
					if(A[i]<A[j]) {
						dp[i][1]=Math.max(dp[i][1], Math.max(dp[j][0]+1,dp[j][1]+1));
						max=Math.max(max, dp[i][1]);
					}
				}
			}
			
			bw.write(String.valueOf(max));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}