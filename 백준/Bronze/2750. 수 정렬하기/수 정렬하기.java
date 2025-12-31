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
				int x=Integer.parseInt(br.readLine().trim());
				list.add(x);
			}
			list.sort(Comparator.naturalOrder());
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<list.size();i++) {
				sb.append(list.get(i));
				if(i!=list.size()-1) sb.append(System.lineSeparator());
			}
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}