import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			int N=Integer.parseInt(input[0]);
			int B=Integer.parseInt(input[1]);
			
			StringBuilder sb=new StringBuilder();
			
			while(N>0) {
				int res=N%B;
				if(res>=10) {
					sb.append((char)('A'+res-10));
				}else {
					sb.append(res);
				}
				N/=B;
			}
			sb.reverse();
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
