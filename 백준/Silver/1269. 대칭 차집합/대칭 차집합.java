import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			String[] input=br.readLine().split(" ");
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			int size=M>N ? N : M;
			
			int[] A=new int[N];
			int[] B=new int[M];
			
			String[] lineA=br.readLine().split(" ");
			
			for(int i=0;i<N;i++) {
				A[i]=Integer.parseInt(lineA[i]);
			}
			
			String[] lineB=br.readLine().split(" ");
			
			for(int i=0;i<M;i++) {
				B[i]=Integer.parseInt(lineB[i]);
			}
			
			Arrays.sort(A);
			Arrays.sort(B);
			
			int x=0;
			int y=0;
			List<Integer> intersection=new ArrayList<>(size);
			
			while(x<N && y<M) {
				if(A[x]==B[y]) {
					intersection.add(A[x]);
					x++;
					y++;
				}else if(A[x]<B[y]) x++; 
				else y++;
			}
			int result=N-intersection.size()+M-intersection.size();
			bw.write(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
