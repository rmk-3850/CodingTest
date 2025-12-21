import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int lineCount=Integer.parseInt(br.readLine().trim());
			int dotCount=2;
			for(int i=0;i<lineCount;i++) {
				dotCount+=Math.pow(2, i);
			}
			int totalDotCount=(int)Math.pow(dotCount, 2);
			bw.write(String.valueOf(totalDotCount));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
