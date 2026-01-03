import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			int N=Integer.parseInt(br.readLine().trim());
			List<Integer> list=new ArrayList<Integer>();
			
			while(N-->0) {
				list.add(Integer.parseInt(br.readLine().trim()));
			}
			list.sort(Comparator.naturalOrder());
			
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			for(Integer i:list) {
				if(!first) sb.append(System.lineSeparator());
				sb.append(i);
				first=false;
			}
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
