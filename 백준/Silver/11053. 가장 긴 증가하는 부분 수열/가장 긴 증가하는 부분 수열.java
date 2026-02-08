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
			int[] dp=new int[N];
			Arrays.fill(dp, 1);
			int max=dp[0];
			for(int i=1;i<N;i++) {
				for(int j=0;j<i;j++) {
					if(A[i]>A[j]) {
						dp[i]=Math.max(dp[i], dp[j]+1);
						max=Math.max(max, dp[i]);
					}
				}
			}
			
			bw.write(String.valueOf(max));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}