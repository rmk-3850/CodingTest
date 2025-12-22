import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			int A=Integer.parseInt(input[0]);
			int B=Integer.parseInt(input[1]);
			int V=Integer.parseInt(input[2]);
			
			double doubleB=B;
			int prevDays=(int)Math.ceil((V-A)/(A-doubleB));
			int days=prevDays+1;
			bw.write(String.valueOf(days));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
