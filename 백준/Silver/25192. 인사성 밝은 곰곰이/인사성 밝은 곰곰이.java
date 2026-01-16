import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int T=Integer.parseInt(br.readLine());
			int sum=0;
			HashSet<String> set=new HashSet<String>();
			boolean enterIsInputed=false;
			while(T-->0) {
				String line=br.readLine();
				if(line.equals("ENTER")) {
					enterIsInputed=true;
					sum+=set.size();
					set.clear();
				}
				else if(enterIsInputed) {
					set.add(line);
				}
			}
			sum+=set.size();
			bw.write(String.valueOf(sum));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}