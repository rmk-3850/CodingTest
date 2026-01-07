import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		

		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
				
			int N=Integer.parseInt(br.readLine().trim());
			String[] myCards=br.readLine().trim().split(" ");
			Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			for(String s:myCards) {
				int x=Integer.parseInt(s);
				if(map.containsKey(x)) {
					map.put(x, map.get(x)+1);
				}else {
					map.put(x, 1);					
				}
			}
			
			int M=Integer.parseInt(br.readLine().trim());
			String[] cards=br.readLine().trim().split(" ");
			
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<cards.length;i++) {
				if(i>0)sb.append(" ");
				int num=Integer.parseInt(cards[i]);
				if(map.containsKey(num)) sb.append(map.get(num));
				else sb.append(0);
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
