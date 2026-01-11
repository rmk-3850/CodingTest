import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	static Stack<Integer> S=new Stack<>();
	static Queue<Integer> Q=new LinkedList<Integer>();
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			boolean[] check=new boolean[N+1];
			Arrays.fill(check, false);
			check[0]=true;
			String[] input=br.readLine().split(" ");
			for(String s:input) {
				Q.add(Integer.parseInt(s));
			}
			
			while(true) {
				int x= !Q.isEmpty() ? Q.peek() : (S.empty() ? 0 : S.peek());
				if(x==0) break;
				if(!check[x-1]) {
					if(S.empty()) {
						Q.poll();
						S.push(x);
					}
					else {
						int stack=S.peek();
						if(check[stack-1]) {
							S.pop();
							check[stack]=true;
						}
						else {
							if(!Q.isEmpty()) {
								Q.poll();
								S.push(x);
							}
							else break;
						}
						
					}
				}
				else {
					check[x]=true;
					if(!Q.isEmpty()) Q.poll();
					else S.pop();
				}
			}
			if(S.empty()) bw.write("Nice");
			else bw.write("Sad");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}