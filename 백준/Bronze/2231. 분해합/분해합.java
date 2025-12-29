import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine().trim());
			
			int result=0;
			for(int i=1;i<N;i++) {
				if(decompositionSum(i)==N) {
					result=i;
					break;
				}
			}
			if(result==0) bw.write(String.valueOf(0));
			else bw.write(String.valueOf(result));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	static int decompositionSum(int n) {
		int x=n;
		int sum=n;
		while(x>0) {
			sum+=x%10;
			x/=10;
		}
		return sum;
	}
}