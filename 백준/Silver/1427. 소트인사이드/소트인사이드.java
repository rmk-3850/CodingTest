import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			String N=br.readLine().trim();
			List<Integer> list=new ArrayList<Integer>();
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<N.length();i++) list.add(N.charAt(i)-'0');
			list.sort(Comparator.reverseOrder());
			
			for(Integer i:list) sb.append(i);
			
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}