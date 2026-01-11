import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	static Deque<Integer> Q=new ArrayDeque<Integer>();
	static int commnad(String str) {
		switch (str) {
			case "pop":		return Q.isEmpty() ? -1 : Q.poll();
			case "size":	return Q.size();
			case "empty":	return Q.isEmpty() ? 1 : 0;
			case "front":	return Q.isEmpty() ? -1 : Q.peekFirst();
			case "back":	return Q.isEmpty() ? -1 : Q.peekLast();
			default:
				return 0;
		}
	}
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(N-->0) {
				String line=br.readLine();
				if(line.startsWith("push")) {
					String[] input=line.split(" ");
					Q.add(Integer.parseInt(input[1]));
				}else {
					if(!first) sb.append(System.lineSeparator());
					sb.append(commnad(line));
					first=false;
				}
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}