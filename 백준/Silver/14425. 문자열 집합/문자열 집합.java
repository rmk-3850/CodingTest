import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			String[] input=br.readLine().trim().split(" ");
			int N=Integer.parseInt(input[0]);
			int M=Integer.parseInt(input[1]);
			
			Set<String> S=new HashSet<>();
			while(N-->0) S.add(br.readLine().trim());
			
			int i=0;
			while(M-->0) {
				String line=br.readLine().trim();
				if(S.contains(line)) i++;
			}
			bw.write(String.valueOf(i));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
