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
				
			int N=Integer.parseInt(br.readLine().trim());
			String[] input1=br.readLine().trim().split(" ");
			int M=Integer.parseInt(br.readLine().trim());
			String[] input2=br.readLine().trim().split(" ");
			
			Set<Integer> myCards=new HashSet<Integer>();
			for(String s:input1)
				myCards.add(Integer.parseInt(s));
			
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<input2.length;i++) {
				if(i>0) sb.append(" ");
				int x=Integer.parseInt(input2[i]);
				if(myCards.contains(x)) sb.append(1);
				else sb.append(0);
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
