import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int n;
			StringBuilder sb=new StringBuilder();
			while((n=Integer.parseInt(br.readLine().trim()))!=-1) {
				List<Integer> list =new ArrayList<Integer>();
				for(int i=1;i<n/2;i++) {
					if(n%i==0) {
						list.add(i);
						if(n/i>=n/2 && n/i!=n)list.add(n/i);
					}
				}
				list.sort(Comparator.naturalOrder());
				int sum=0;
				for(int i : list) {
					sum+=i;
				}
				if(sum==n) {
					sb.append(n+" = ");
					for(int i=0;i<list.size();i++) {
						if(i!=0) sb.append(" + ");
						sb.append(String.valueOf(list.get(i)));
					}
					sb.append(System.lineSeparator());
				}else {
					sb.append(n+" is NOT perfect.").append(System.lineSeparator());
				}
			}
			bw.write(sb.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}