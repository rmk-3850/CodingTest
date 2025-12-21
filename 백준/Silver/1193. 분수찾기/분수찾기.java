import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			long X=Integer.parseInt(br.readLine().trim());
			
			int sum=2;
			
			long referenceNumber=1;
			int number=2;
			while(X>referenceNumber) {				
				referenceNumber+=number++;
				sum++;
			}
			
			int diff=(int)(referenceNumber-X);
			
			int count=(int)Math.pow(-1, sum);
			
			int numerator=count>0 ? 1 : sum-1;
			int denominator=count>0 ? sum-1 : 1;
			
			while(diff-->0) {
				numerator+=count;
				denominator+=-count;
			}
			StringBuilder sb=new StringBuilder();
			sb.append(numerator).append("/").append(denominator);
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
