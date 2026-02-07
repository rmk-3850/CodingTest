import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			int[] A=new int[N+1];
			A[0]=A[1]=0;
			for(int i=2;i<A.length;i++) {
				A[i]=A[i-1];
				if(i%2==0) A[i]=Math.min(A[i], A[i/2]);
				if(i%3==0) A[i]=Math.min(A[i], A[i/3]);
				A[i]++;
			}
			bw.write(String.valueOf(A[N]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
