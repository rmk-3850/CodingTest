import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] input=br.readLine().trim().split(" ");
			
			int N=Integer.parseInt(input[0]);
			int K=Integer.parseInt(input[1]);
			
			List<Integer> list=new ArrayList<Integer>();
			
			int number=1;
			
			while(number<=N) {
				if(N%number==0) list.add(number);
				if(list.size()>=K) break;
				number++;
			}
			
			int kthValue=0;
			
			if(list.size()>=K) kthValue=list.get(K-1);
			
			bw.write(String.valueOf(kthValue));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
