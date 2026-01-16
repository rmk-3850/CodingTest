import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int T=Integer.parseInt(br.readLine());
			HashSet<String> set=new HashSet<String>();
			set.add("ChongChong");
			while(T-->0) {
				String[] line=br.readLine().split(" ");
				String p1=line[0];
				String p2=line[1];
				if(set.contains(p1) && set.contains(p2)) continue;
				else if(set.contains(p1) || set.contains(p2)) {
					String p=set.contains(p1) ? p2 : p1;
					set.add(p);
				}
			}
			bw.write(String.valueOf(set.size()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
