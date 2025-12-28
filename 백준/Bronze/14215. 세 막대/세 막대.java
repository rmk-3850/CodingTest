import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			int a=Integer.parseInt(input[0]);
			int b=Integer.parseInt(input[1]);
			int c=Integer.parseInt(input[2]);
					
			int maxSide=Math.max(a,Math.max(b, c));
			
			int elseSum=maxSide==a ? b+c : maxSide==b ? a+c : a+b;
			
			while(maxSide>=elseSum) {
				maxSide--;
			}
			bw.write(String.valueOf(maxSide+elseSum));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
