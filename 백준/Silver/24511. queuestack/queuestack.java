import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N =Integer.parseInt(br.readLine());
			ArrayDeque<Integer> dq=new ArrayDeque<Integer>(N);
			StringTokenizer st1=new StringTokenizer(br.readLine());
			StringTokenizer st2=new StringTokenizer(br.readLine());
			while(st1.hasMoreTokens()) {
				int type=Integer.parseInt(st1.nextToken());
				int x=Integer.parseInt(st2.nextToken());
				if(type==0) dq.addFirst(x);
			}
			int M=Integer.parseInt(br.readLine());
			StringTokenizer st=new StringTokenizer(br.readLine());
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(st.hasMoreTokens()) {
				if(!first) sb.append(" ");
				int next=Integer.parseInt(st.nextToken());
				if(dq.isEmpty()) {
					sb.append(next);
				}else {
					sb.append(dq.poll());
					dq.add(next);					
				}
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
