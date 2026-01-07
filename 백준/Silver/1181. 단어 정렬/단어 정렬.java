import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			int N=Integer.parseInt(br.readLine().trim());
			String line="";
			Set<String> set=new HashSet<String>();
			while((line=br.readLine())!=null) {
				set.add(line.trim());
			}
			
			List<String> list=new ArrayList<String>(set);
			list.sort(Comparator.comparing(String::length)
								.thenComparing(Comparator.naturalOrder())					
			);
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			for(String s:list) {
				if(!first) sb.append(System.lineSeparator());
				sb.append(s);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}