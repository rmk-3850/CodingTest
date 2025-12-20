import java.io.*;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=9;
			int M=9;
			
			int max=Integer.MIN_VALUE;
			int idxOfRow=0;
			int idxOfCol=0;
			for(int i=0;i<N;i++) {
				String[] input=br.readLine().trim().split(" ");
				
				for(int j=0;j<M;j++) {
					int element= Integer.parseInt(input[j]);
					if(element>max) {
						max=element;
						idxOfRow=i;
						idxOfCol=j;
					}
				}
			}
			
			StringBuilder sb=new StringBuilder();
			sb.append(String.valueOf(max))
				.append(System.lineSeparator())
				.append(String.valueOf(idxOfRow+1))
				.append(" ")
				.append(String.valueOf(idxOfCol+1));
			
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}