import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out))) {
			
			int N=Integer.parseInt(br.readLine());
			int[] arr=new int[N];
			int offset=4000;
			int[] allList=new int[8001];
			int i=0;
			double sum=0;
			while(N-->0) {
				int x=Integer.parseInt(br.readLine());
				arr[i]=x;
				sum+=x;
				allList[x+offset]++;
				i++;
			}
			Arrays.sort(arr);
			
			int[] sortedAllList= Arrays.copyOf(allList, 8001);
			Arrays.sort(sortedAllList);
			int countOfMost=sortedAllList[8000];
			
			ArrayList<Integer> mostList=new ArrayList<Integer>();
			
			for(int j=0;j<allList.length;j++) {
				if(allList[j]==countOfMost) mostList.add(j-offset);				
			}
			mostList.sort(Comparator.naturalOrder());
			long avg=round(sum/arr.length);
			int mid=arr[(arr.length-1)/2];
			int most=mostList.size()>1 ? mostList.get(1) : mostList.get(0);
			int range=arr[arr.length-1]-arr[0];
			
			
			
			StringBuilder sb=new StringBuilder();
			sb.append(avg)
				.append(System.lineSeparator()).append(mid)
				.append(System.lineSeparator()).append(most)
				.append(System.lineSeparator()).append(range);
			
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static long round(double d) {
		if(d<0 && d-Math.floor(d)==0.5) {
			return Math.round(d)-1;
		}else return Math.round(d);
	}
}
