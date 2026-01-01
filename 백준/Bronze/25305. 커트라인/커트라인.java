import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			List<Integer> list=new ArrayList<Integer>();
			String[] line1=br.readLine().trim().split(" ");
			int N=Integer.parseInt(line1[0]);
			int k=Integer.parseInt(line1[1]);
			String[] line2=br.readLine().trim().split(" ");
			for(String s:line2) list.add(Integer.parseInt(s));
			list.sort(Comparator.reverseOrder());
			
			bw.write(String.valueOf(list.get(k-1)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
