import java.io.*;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] matrix=br.readLine().trim().split(" ");
			int N=Integer.parseInt(matrix[0]);
			int M=Integer.parseInt(matrix[1]);
			
			int[][] A=new int[N][M];
			
			
			for(int x=0;x<2*N;x++) {
				String[] input=br.readLine().trim().split(" ");
				for(int y=0;y<M;y++) {
					if(x<N) {
						A[x][y]+=Integer.parseInt(input[y]);						
					}else {
						A[x-N][y]+=Integer.parseInt(input[y]);
					}
				}
			}
			StringBuilder sb=new StringBuilder();
			for(int x=0;x<A.length;x++) {
				for(int y=0;y<A[0].length;y++) {
					sb.append(String.valueOf(A[x][y]));
					sb.append(" ");
				}
				sb.append(System.lineSeparator());
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}