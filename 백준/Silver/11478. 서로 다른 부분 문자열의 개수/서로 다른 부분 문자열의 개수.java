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
				
			String str=br.readLine();
			Set<String> set=new HashSet<String>();
			
			for(int i=0;i<str.length();i++) {
				for(int j=i+1;j<=str.length();j++) {
					set.add(str.substring(i,j));
				}
			}
			
			bw.write(String.valueOf(set.size()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}