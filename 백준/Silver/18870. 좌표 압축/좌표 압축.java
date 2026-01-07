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
			String[] input=br.readLine().trim().split(" ");
			int[] arr=new int[N];
			int[] sortedArr=new int[N];
			for(int i=0;i<input.length;i++) {
				int x=Integer.parseInt(input[i]);
				arr[i]=x;
				sortedArr[i]=x;
			}
			
			Arrays.sort(sortedArr);
			
			Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			
			int k=0;
			for(int i=0;i<sortedArr.length;i++) {
				if(!map.containsKey(sortedArr[i]))
					map.put(sortedArr[i], k++);
			}
			
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<arr.length;i++) {
				if(i>0) sb.append(" ");
				sb.append(map.get(arr[i]));
			}
			
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}