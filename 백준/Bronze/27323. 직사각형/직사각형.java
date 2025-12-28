import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			
			int A=Integer.parseInt(br.readLine().trim());
			int B=Integer.parseInt(br.readLine().trim());
			
			bw.write(String.valueOf(A*B));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}