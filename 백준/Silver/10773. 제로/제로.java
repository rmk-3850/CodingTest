import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			Stack<Integer> S=new Stack<Integer>();
			
			int N=Integer.parseInt(br.readLine());
			while(N-->0) {
				int x=Integer.parseInt(br.readLine());
				if(x==0) S.pop();
				else S.push(x);
			}
			int sum=0;
			Iterator<Integer> i=S.iterator();
			while(i.hasNext()) {
				sum+=i.next();
			}
			bw.write(String.valueOf(sum));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}