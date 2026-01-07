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
			List<String[]> list=new ArrayList<String[]>();
			String line="";
			while((line=br.readLine())!=null) {
				list.add(line.trim().split(" "));
			}
			
			list.sort((a,b)-> Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0])));
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			for(String[] s:list) {
				if(!first) sb.append(System.lineSeparator());
				sb.append(s[0]).append(" ").append(s[1]);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}