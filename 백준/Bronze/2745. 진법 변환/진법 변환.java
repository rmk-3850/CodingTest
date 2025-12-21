import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			String N=input[0];
			int B=Integer.parseInt(input[1]);
			
			int n=0;
			for(int i=0;i<N.length();i++) {
				char c=N.charAt(i);
				if('A'<=c && c<='Z') {
					n+=(c-'A'+10)*((int) Math.pow(B, N.length()-i-1));
				}else {
					n+=(c-'0')*((int) Math.pow(B, N.length()-i-1));
				}
			}
			bw.write(String.valueOf(n));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}