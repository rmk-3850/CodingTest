import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			
			int N=Integer.parseInt(br.readLine().trim());
			StringBuilder sb=new StringBuilder();
			if(N==1) {}
			else if(N==2 || N==3) {
				bw.write(String.valueOf(N));
			}
			else {
				int i=2;
				while(N>1) {
					if(N%i==0) {
						sb.append(String.valueOf(i)).append(System.lineSeparator());
						N/=i;
					}else i++;
				}
				bw.write(sb.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}