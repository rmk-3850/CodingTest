import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	static Stack<Integer> s=new Stack<Integer>();
	static int command(int x) {
		switch (x) {
			case 2:
				return s.empty() ? -1 : s.pop();
			case 3:
				return s.size();
			case 4:
				return s.empty() ? 1 : 0;
			case 5:
				return s.empty() ? -1 : s.peek();
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
				String input=br.readLine();
				if(input.matches("\\d+")) {
					if(!first) sb.append(System.lineSeparator());
					int result=command(Integer.parseInt(input));
					sb.append(result);
					first=false;
				}else {
					String[] arr=input.split(" ");
					if(arr[0].equals("1")) {
						int X=Integer.parseInt(arr[1]);
						s.push(X);
					}
				}
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
