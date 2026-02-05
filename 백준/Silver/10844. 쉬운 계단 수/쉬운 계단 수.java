import java.io.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			long[][] arr=new long[N+1][11];
			arr[1][0]=0;
			arr[1][10]=9;
			for(int i=1;i<arr[1].length-1;i++) {
				arr[1][i]=1;
			}
			for(int i=2;i<arr.length;i++) {
				long sum=0;
				for(int j=0;j<arr[0].length-1;j++) {
					if(j>0) {
						arr[i][j]+=arr[i-1][j-1];
					}
					if(j<9) {
						arr[i][j]+=arr[i-1][j+1];
					}
					arr[i][j]%=1_000_000_000;
					sum+=arr[i][j];
					sum%=1_000_000_000;
				}
				arr[i][10]=sum%=1_000_000_000;
			}
			bw.write(String.valueOf(arr[N][10]));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}