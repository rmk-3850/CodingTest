import java.io.*;
import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int lineCount=Integer.parseInt(br.readLine().trim());
			int groupWords=0;
			Loop :while(lineCount-->0) {
				boolean[] alphabetArr=new boolean[26];
				String input=br.readLine().trim();
				char prev=input.charAt(0);
				for(int i=0;i<input.length();i++) {
					char now=input.charAt(i);
					if(alphabetArr[now-'a']) continue Loop;
					if(prev!=now) {
						alphabetArr[prev-'a']=true;
						prev=now;
					}
				}
				groupWords++;
			}
			bw.write(String.valueOf(groupWords));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
