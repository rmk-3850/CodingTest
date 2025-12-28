import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringBuilder sb=new StringBuilder();
			long n=Integer.parseInt(br.readLine().trim());
			
			long numberOfIterations=n*(n-1)/2;
			
			sb.append(String.valueOf(numberOfIterations)).append(System.lineSeparator()).append(String.valueOf(2));
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
