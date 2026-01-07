import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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
			
			String[] notHeard=new String[N];
			String[] notSaw=new String[M];
			
			for(int i=0;i<N;i++) notHeard[i]=br.readLine();
			for(int i=0;i<M;i++) notSaw[i]=br.readLine();
			
			Arrays.sort(notHeard);
			Arrays.sort(notSaw);
			
			int x=0;
			int y=0;
			List<String> notHeardAndSaw=new ArrayList<String>();
			
			while(x<N && y<M) {
				if(notHeard[x].equals(notSaw[y])) {
					notHeardAndSaw.add(notHeard[x]);
					x++;
					y++;
				}else if(notHeard[x].compareTo(notSaw[y])<0) x++; 
				else y++;
			}
			
			
			notHeardAndSaw.sort(Comparator.naturalOrder());
			
			StringBuilder sb=new StringBuilder();
			sb.append(notHeardAndSaw.size());
			for(int i=0;i<notHeardAndSaw.size();i++) {
				sb.append(System.lineSeparator()).append(notHeardAndSaw.get(i));
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
