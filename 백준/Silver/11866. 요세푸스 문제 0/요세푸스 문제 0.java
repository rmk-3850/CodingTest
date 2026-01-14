import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().split(" ");
			int N=Integer.parseInt(input[0]);
			int K=Integer.parseInt(input[1]);
			LinkedList<Integer> Q=new LinkedList<Integer>();
			List<Integer> list=new ArrayList<Integer>();
			for(int i=1;i<=N;i++) {
				Q.offer(i);
			}
			int idx=0; 
			int count;
			while(list.size()<N) {
				count=0;
				while(true) {
					if(Q.get(idx)!=0) {
						count++;
					}
					if(count==K) break;
					idx=idx+1>=N ? (idx+1)%N : idx+1;
				}
				list.add(Q.get(idx));
				Q.set(idx, 0);
			}
			StringBuilder sb=new StringBuilder();
			sb.append("<");
			for(int i=0;i<list.size();i++) {
				if(i>0)sb.append(", ");
				sb.append(list.get(i));
			}
			sb.append(">");
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
