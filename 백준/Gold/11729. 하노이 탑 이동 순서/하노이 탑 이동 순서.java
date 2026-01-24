import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N=Integer.parseInt(br.readLine());
			int result=(int)(Math.pow(2, N))-1;
			sb.append(result);
			move(N,1,3);
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static StringBuilder sb=new StringBuilder();
	static void move(int n,int from,int to) {
		if(n==1) {
			sb.append(System.lineSeparator()).append(from).append(' ').append(to);
			return;
		}
		move(n-1,from,6-from-to);
		move(1,from,to);
		move(n-1,6-from-to,to);
	}
}