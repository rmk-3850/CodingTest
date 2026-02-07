import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			int[][] A=new int[N][3];
			for(int i=0;i<N;i++) {
				String[] line=br.readLine().split(" ");
				for(int j=0;j<line.length;j++) {
					A[i][j]=Integer.parseInt(line[j]);
				}
			}
			int[][] dp=new int[N][3];
			for(int i=0;i<N;i++) {
				if(i==0) {
					for(int j=0;j<3;j++)
						dp[0][j]=A[0][j];
				}
				else {
					dp[i][0]=Math.min(dp[i-1][1], dp[i-1][2])+A[i][0];
					dp[i][1]=Math.min(dp[i-1][0], dp[i-1][2])+A[i][1];
					dp[i][2]=Math.min(dp[i-1][0], dp[i-1][1])+A[i][2];
				}				
			}
			bw.write(String.valueOf(Math.min(dp[N-1][2], Math.min(dp[N-1][0], dp[N-1][1]))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}