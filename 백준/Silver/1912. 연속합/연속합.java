import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			int[] A=new int[N];
			StringTokenizer st=new StringTokenizer(br.readLine());
			int l=0;
			while(st.hasMoreTokens()) {
				A[l++]=Integer.parseInt(st.nextToken());
			}
			int[] dp=new int[N];
			dp[0]=A[0];
			int max=dp[0];
			for(int i=1;i<dp.length;i++) {
				dp[i]=Math.max(dp[i-1]+A[i], A[i]);
				max=Math.max(max, dp[i]);
			}
			bw.write(String.valueOf(max));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
