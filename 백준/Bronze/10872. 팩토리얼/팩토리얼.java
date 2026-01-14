import java.io.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N =Integer.parseInt(br.readLine());
			if(N==0) bw.write(String.valueOf(1));
			else {
				long result=1;
				while(N>0) {
					result*=N--;
				}
				bw.write(String.valueOf(result));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
