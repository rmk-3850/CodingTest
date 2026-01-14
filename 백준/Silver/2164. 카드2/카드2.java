import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			Deque<Integer> Q=new ArrayDeque<Integer>(N);
			for(int i=1;i<=N;i++) {
				Q.offer(i);
			}
			while(Q.size()>1) {
				Q.pollFirst();
				if(Q.size()==1) break;
				int first=Q.pollFirst();
				Q.offer(first);
			}
			bw.write(String.valueOf(Q.pop()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}