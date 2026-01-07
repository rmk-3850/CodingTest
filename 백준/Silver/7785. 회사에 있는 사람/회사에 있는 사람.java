import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			int N=Integer.parseInt(br.readLine().trim());
			
			Set<String> S=new HashSet<String>();
			while(N-->0) {
				String[] input=br.readLine().trim().split(" ");
				if(input[1].equals("enter")) S.add(input[0]);
				else S.remove(input[0]);		
				
			}
			List<String> list = new ArrayList<String>(S);
			list.sort(Comparator.reverseOrder());
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<list.size();i++) {
				if(i>0)sb.append(System.lineSeparator());
				sb.append(list.get(i));
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
