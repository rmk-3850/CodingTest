import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			List<Integer> list=new ArrayList<Integer>();
			int sum=0;
			String line;
			while((line=br.readLine())!=null) {
				int x=Integer.parseInt(line.trim());
				sum+=x;
				list.add(x);
			}
			list.sort(Comparator.naturalOrder());
			StringBuilder sb=new StringBuilder();
			int avg=sum/5;
			sb.append(avg).append(System.lineSeparator()).append(list.get(2));
			bw.write(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}