import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine().trim());
			
			int count=0;
			int result=0;
			for(int i=666;true;i++) {
				if(contain666(i)) {
					count++;
				}
				if(count==N) {
					result=i;
					break;
				}
			}
			bw.write(String.valueOf(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	static boolean contain666(int n) {
		StringBuilder sb=new StringBuilder();
		int x=n;
		while(x>0) {
			sb.append(x%10);
			x/=10;
		}
		return sb.toString().contains("666");
	}
}
