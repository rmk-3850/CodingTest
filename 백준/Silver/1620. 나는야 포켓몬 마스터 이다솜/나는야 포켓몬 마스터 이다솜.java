import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			String[] input=br.readLine().trim().split(" ");
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			
			Map<Integer,String> map=new HashMap<>();
			Map<String,Integer> map2=new HashMap<>();
			int i=1;
			while(N-->0) {
				String line=br.readLine().trim();
				map.put(i,line);
				map2.put(line,i);
				i++;
			}
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			while(M-->0) {
				if(!first) sb.append(System.lineSeparator());
				String line=br.readLine().trim();
				if(line.matches("\\d+")) sb.append(map.get(Integer.parseInt(line)));
				else sb.append(map2.get(line));
				first=false;
			}
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}