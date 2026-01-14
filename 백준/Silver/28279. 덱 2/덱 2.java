import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
	static ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
	static int command(int x) {
		switch (x) {
		case 3: return dq.isEmpty() ? -1 : dq.pollFirst();
		case 4: return dq.isEmpty() ? -1 : dq.pollLast();
		case 5: return dq.size();
		case 6: return dq.isEmpty() ? 1 : 0;
		case 7: return dq.isEmpty() ? -1 : dq.peekFirst();
		case 8: return dq.isEmpty() ? -1 : dq.peekLast();
		default:
			return -1;
		}
	}
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(N-->0) {
				String input=br.readLine();
				if(input.matches("\\d+")) {
					if(!first) sb.append(System.lineSeparator());
					sb.append(command(Integer.parseInt(input)));
					first=false;
				}else {
					String[] arr=input.split(" ");
					if(Integer.parseInt(arr[0])==1) dq.addFirst(Integer.parseInt(arr[1]));
					else dq.addLast(Integer.parseInt(arr[1]));
				}
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}