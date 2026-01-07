import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			String[] input=br.readLine().split(" ");
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			int size=M>N ? N : M;
			
			Set<String> notHeard=new HashSet<String>(N);
			Set<String> notSaw=new HashSet<String>(M);
			
			while(N-->0) notHeard.add(br.readLine());
			while(M-->0) notSaw.add(br.readLine());
			
			
			Set<String> notHeardAndSaw=new HashSet<String>(size);
			
			for(String s:notHeard) {
				if(notSaw.contains(s)) notHeardAndSaw.add(s);
			}
			
			List<String> list=new ArrayList<String>(notHeardAndSaw);
			
			list.sort(Comparator.naturalOrder());
			
			StringBuilder sb=new StringBuilder();
			sb.append(list.size());
			for(int i=0;i<list.size();i++) {
				sb.append(System.lineSeparator()).append(list.get(i));
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}