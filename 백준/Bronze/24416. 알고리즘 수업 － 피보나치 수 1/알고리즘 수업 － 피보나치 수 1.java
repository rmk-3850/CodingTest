import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			
			StringBuilder sb=new StringBuilder();
			sb.append(pibo(N)).append(' ').append(N-2);
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static int pibo(int n) {
		if(n==1 || n==2) return 1;
		return pibo(n-1)+pibo(n-2);
	}
}
