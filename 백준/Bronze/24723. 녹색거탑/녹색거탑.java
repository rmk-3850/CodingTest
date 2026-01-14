import java.io.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N =Integer.parseInt(br.readLine());
			bw.write(String.valueOf((int)(Math.pow(2, N))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
