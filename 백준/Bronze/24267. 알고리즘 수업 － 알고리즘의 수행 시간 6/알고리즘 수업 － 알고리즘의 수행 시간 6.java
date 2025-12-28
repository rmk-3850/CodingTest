import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			StringBuilder sb=new StringBuilder();
			long n=Integer.parseInt(br.readLine().trim());
			
			long numberOfIteration=0;
			for(long i=1;i<=n-2;i++) {
				numberOfIteration+=(n-i-1)*(n-i)/2;
			}
			
			sb.append(String.valueOf(numberOfIteration)).append(System.lineSeparator()).append(String.valueOf(3));
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
