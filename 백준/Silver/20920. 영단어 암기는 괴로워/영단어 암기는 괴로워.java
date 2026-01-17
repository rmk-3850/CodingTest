import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			String[] line1=br.readLine().split(" ");
			int N=Integer.parseInt(line1[0]);
			int M=Integer.parseInt(line1[1]);
			
			HashMap<String, Integer> map=new HashMap<String, Integer>(N);
			
			while(N-->0) {
				String input=br.readLine();
				if(input.length()>=M) {
					map.put(input, map.getOrDefault(input, 0)+1);
				}
			}
			ArrayList<String> list=new ArrayList<>(map.keySet());
			list.sort(Comparator.<String, Integer>comparing(map::get,Comparator.reverseOrder())
						.thenComparing(String::length,Comparator.reverseOrder())
						.thenComparing(Comparator.naturalOrder())
			);
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<list.size();i++) {
				if(i>0) sb.append(System.lineSeparator());
				sb.append(list.get(i));
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
