import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			int N=Integer.parseInt(br.readLine().trim());
			List<int[]> list=new ArrayList<int[]>();
			String line="";
			while((line=br.readLine())!=null) {
				String[] input=line.trim().split(" ");
				int x=Integer.parseInt(input[0]);
				int y=Integer.parseInt(input[1]);
				list.add(new int[] {x,y});
			}
			
			list.sort((a,b)->{
				int r=Integer.compare(a[1], b[1]);
				if(r!=0) return r;
				return Integer.compare(a[0], b[0]);
			});
			StringBuilder sb=new StringBuilder();
			boolean first=true;
			for(int[] arr:list) {
				if(!first) sb.append(System.lineSeparator());
				sb.append(arr[0]).append(" ").append(arr[1]);
				first=false;
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
