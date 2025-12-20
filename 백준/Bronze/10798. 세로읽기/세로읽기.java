import java.io.*;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			char[][] matrix=new char[5][];
			int maxCol=0;
			for(int i=0;i<matrix.length;i++) {
				String input=br.readLine().trim();
				int size=input.length();
				maxCol=Math.max(maxCol, size);
				matrix[i]=new char[size];
				for(int j=0;j<size;j++) {
					matrix[i][j]=input.charAt(j);
				}
			}
			StringBuilder sb=new StringBuilder();
			
			for(int j=0;j<maxCol;j++) {
				for(int i=0;i<matrix.length;i++) {
					if(j<matrix[i].length)
						sb.append(matrix[i][j]);
				}
				
			}
				
			
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}