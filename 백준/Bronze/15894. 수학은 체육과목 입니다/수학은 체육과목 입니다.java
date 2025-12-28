import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			long n=Integer.parseInt(br.readLine().trim());
			bw.write(String.valueOf(n*4));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
